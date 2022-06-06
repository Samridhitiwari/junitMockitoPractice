package com.mocking.BusinessImpl;

import com.mocking.JunitMockito.Business.TodoBusinessImpl;
import com.mocking.JunitMockito.Service.TodoService;
import data.api.TodoServiceStub;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class TodoBusinessImplTest {
    @Test
    public void retrieveTodoRelatedToSpringtest(){
        TodoService todoService=new TodoServiceStub();
        TodoBusinessImpl todoBusiness=new TodoBusinessImpl(todoService);
        List<String> todos=todoBusiness.retrieveTodoRelatedToSpring("Samridhi");
        assertEquals(2,todos.size());
    }
}
