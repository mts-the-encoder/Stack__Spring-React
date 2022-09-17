import React from "react";
import { Todo } from "../models/Todo";
import TodoListItem from "./TodoListItem";

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
                        todo => (<TodoListItem key={todo.id}/>)
                    )
                }
            </tbody>
        </table>
    )
}

export default TodoList;