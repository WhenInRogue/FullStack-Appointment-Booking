import React from 'react'
import { Link } from 'react-router-dom';

export default function ViewAppointment() {
  return (
    <div className="container">
      <div className="row">
            <div className="col-md-6 offset-md-3 border rounded p-4 mt-2 shadow">
                <h2 className="text-center m-4">Appointment Details</h2>

                <div className="card">
                    <div className="card-header">
                        Details of appointment: {}
                        <ul className="list-group list-group-flush">
                            <li className="list-group-item">
                                <b>Date: </b>
                                {/* {appointment.date} */}
                            </li>

                            <li className="list-group-item">
                                <b>Start Time: </b>
                                {/* {appointment.startTime} */}
                            </li>

                            <li className="list-group-item">
                                <b>End Time: </b>
                                {/* {appointment.endTime} */}
                            </li>

                            <li className="list-group-item">
                                <b>User ID: </b>
                                {/* {user.id} */}
                            </li>
                        </ul>
                    </div>
                </div>
                <Link className="btn btn-primary mx-2 my-2" to={"/"}>
                    Back to Home
                </Link>
            </div>
        </div>
    </div>
  );
}
