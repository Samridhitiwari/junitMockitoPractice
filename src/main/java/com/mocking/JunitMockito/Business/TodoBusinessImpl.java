package com.mocking.JunitMockito.Business;

import com.mocking.JunitMockito.Service.TodoService;

import java.util.ArrayList;
import java.util.List;

public class TodoBusinessImpl {
    private TodoService todoService;

    public TodoBusinessImpl(TodoService todoService) {
        this.todoService = todoService;
    }
    public List<String>  retrieveTodoRelatedToSpring(String user){
        List<String> FilteredTodos=new ArrayList<>();
        List<String> todos=todoService.retrieveTodos(user);
        for(String t:todos){
            if(t.contains("Spring")){
                FilteredTodos.add(t);
            }
        }
        return FilteredTodos;
    }
}
