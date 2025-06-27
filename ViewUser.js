import axios from 'axios';
import React, { useEffect, useState } from 'react';
import { Link, useParams } from 'react-router-dom';

export default function ViewUser() {

    const [user,setUser]=useState({
        name:"",
        username:"",
        email:""
    });

    const {id}=useParams();

    useEffect(()=>{
        loadUser();
    }, []);

    const loadUser=async ()=>{
        const result=await axios.get(`http://localhost:8080/user/${id}`);
        setUser(result.data);
    }
    
    /*Apoointment section*/
    /*const [appointment, setAppointments]=useState([]);

    useEffect(()=>{
        loadAppointments();
    },[]);

    const loadAppointments= async () => {
        const result = await axios.get("http://localhost:8080/appointments");
        console.log(result.data);
    };*/
    

  return (
    <div className="container">

        <div className="row">
            <div className="col-md-6 offset-md-3 border rounded p-4 mt-2 shadow">
                <h2 className="text-center m-4">User Details</h2>

                <div className="card">
                    <div className="card-header">
                        Details of user id: {user.id}
                        <ul className="list-group list-group-flush">
                            <li className="list-group-item">
                                <b>Name: </b>
                                {user.name}
                            </li>

                            <li className="list-group-item">
                                <b>UserName: </b>
                                {user.username}
                            </li>

                            <li className="list-group-item">
                                <b>Email: </b>
                                {user.email}
                            </li>
                        </ul>
                    </div>
                </div>
                <Link className="btn btn-success" to="/addappointment">
                    Book Appointment
                </Link>
                <Link className="btn btn-primary mx-2 my-2" to={"/"}>
                    Back to Home
                </Link>
            </div>
        </div>

        <div className="pt-4">
        <table className="table border shadow">
          <thead>
            <tr>
              <th scope="col">
                Appointments
              </th>
            </tr>
          </thead>
        </table>
        </div>

        <div className="pt-0 py-4">
            <table className="table border shadow">
                <thead>
                   <tr>
                    <th scope="col">#</th>
                    <th scope="col">Date</th>
                    <th scope="col">Start Time</th>
                    <th scope="col">End Time</th>
                    <th scope="col">User ID</th>
                    <th scope="col">Action</th>
                   </tr>
                </thead>
                <tbody>
                <tr>
                    <th scope="row">1</th>
                    <td>11/24/2024</td>
                    <td>8:00</td>
                    <td>8:30</td>
                    <td>#1</td>
                    <td>
                        <Link className="btn btn-primary mx-2" to={`/viewappointment`}>
                        View
                        </Link>
                        <Link className="btn btn-outline-primary mx-2" to={`/editappointment`}
                        >
                            Edit
                        </Link>
                        <button className="btn btn-danger mx-2"

                            /*onClick={()=>deleteAppointment(appointment.id)}*/
                        >
                            Delete
                        </button>
                    </td>
                    </tr>
                </tbody>
            </table>
        </div>

    </div>
  );
}
