import React from "react";
import { Todo } from "../models/Todo";

const TodoList = () => {
    const todos: Todo[] = [
        {
            id: 1,
            title: "We should do this again",
            done: false
        },
        {
            id: 2,
            title: "And I won't",
            done: false
        }
    ];

    return (
        <table className="uk-table">
            <caption className="mts--caption">To-Do List</caption>
            <thead>
                <tr>
                    <th>#</th>
                    <th>Task</th>
                    <th></th>
                </tr>
            </thead>
            <tbody>
                {
                    todos?.map(
                        todo => (<div key={todo.id}> {todo.title} </div>)
                    )
                }
            </tbody>
        </table>
    )
}

export default TodoList;