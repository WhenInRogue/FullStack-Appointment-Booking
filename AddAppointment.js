import React from 'react';
import axios from 'axios';
import { Link } from 'react-router-dom';

export default function AddAppointment() {
  return (
    <div className="container">
        <div className="row">
            <div className="col-md-6 offset-md-3 border rounded p-4 mt-2 shadow">
                <h2 className="text-center m-4">Create Appointment</h2>

                <form /*onSubmit={(event)=>onSubmit(event)}*/>
                <div className="mb-3">
                    <label htmlFor="date" className="form-label">
                        Date
                    </label>
                    <input
                        type={"text"}
                        className="form-control"
                        placeholder="Enter desired date"
                        name="date"
                        // value={date}
                        // onChange={(event)=>onInputChange(event)}
                    />
                </div>

                <div className="mb-3">
                    <label htmlFor="startTime" className="form-label">
                        Start Time
                    </label>
                    <input
                        type={"text"}
                        className="form-control"
                        placeholder="Enter desired start time"
                        name="startTime"
                        // value={startTime}
                        // onChange={(event)=>onInputChange(event)}
                    />
                </div>

                <div className="mb-3">
                    <label htmlFor="endTime" className="form-label">
                        End Time
                    </label>
                    <input
                        type={"text"}
                        className="form-control"
                        placeholder="Enter desired end time"
                        name="endTime"
                        //value={endTime}
                        //onChange={(event)=>onInputChange(event)}
                    />
                </div>

                <div className="mb-3">
                    <label htmlFor="userID" className="form-label">
                        User ID
                    </label>
                    <input
                        type={"text"}
                        className="form-control"
                        placeholder="Enter your user id"
                        name="userID"
                        //value={userID}
                        //onChange={(event)=>onInputChange(event)}
                    />
                </div>

                <button type="submit" className="btn btn-outline-primary">
                    Submit
                </button>
                <Link className="btn btn-outline-danger mx-2" to="/">
                    Cancel
                </Link>
              </form>
            </div>
        </div>
    </div>
  );
}
