import React, { createContext } from "react";
import { TodoContextType } from './TodoContextType';
import { Todo } from './../models/Todo';

export const TodoContext = createContext<TodoContextType>({
    todos: [],
    addTodo: () => {},
    removeTodo: () => {},
    toggle: () => {},
});

const TodoProvider = (props: any) => { 
    const todos: Todo[] =
    [
        { id: 1, title: "We should do this again", done: true },
        { id: 2, title: "And I won't", done: false }
    ];

    const addTodo = (ttle: string) => {

    }

    const removeTodo = (ttle: Todo) => {

    }

    const toggle = (ttle: Todo) => {
        
    }

    return (
        <TodoContext.Provider value={{ todos, addTodo, removeTodo, toggle }}>
            {props.children}
        </TodoContext.Provider>
    );
};

export default TodoProvider;