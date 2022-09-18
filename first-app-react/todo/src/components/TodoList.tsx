import React, { useContext } from "react";
import TodoListItem from "./TodoListItem";
import { TodoContextType } from './../contexts/TodoContextType';
import { TodoContext } from './../contexts/TodoContext';

const TodoList = () => {
    const { todos } = useContext<TodoContextType>(TodoContext);

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
                        todo => (<TodoListItem key={todo.id} todo={todo}/>)
                    )
                }
            </tbody>
        </table>
    )
}

export default TodoList;