package data.api;

import com.mocking.JunitMockito.Service.TodoService;

import java.util.Arrays;
import java.util.List;

public class TodoServiceStub implements TodoService {

    @Override
    public List<String> retrieveTodos(String user) {
        return Arrays.asList("Learn java","Learn Spring","Spring MVC","hibernate");
    }
}
