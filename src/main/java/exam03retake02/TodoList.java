package exam03retake02;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TodoList {

    private List<Todo> todoList = new ArrayList<>();

    public void addTodo(Todo todo) {
        todoList.add(todo);
    }

    public List<Todo> getTodos() {
        return todoList;
    }

    public int getNumberOfItemsLeft() {
        int result = 0;
        for(Todo todo:todoList){
            if(todo.getState()==State.COMPLETED){
                result++;
            }
        }
        return result;
    }

    public List<String> getMostImportantTodosText() {
        List<String> result = new ArrayList<>();
        int maxPriority = 5;

        for(Todo todo:todoList){
            if(todo.getPriority()<maxPriority){
                maxPriority= todo.getPriority();
            }
        }

        for(Todo todo:todoList){
            if(todo.getPriority()==maxPriority){
                result.add(todo.getText());
            }
        }
        return result;
    }

    public void deleteCompleted() {
        todoList.removeIf(todo -> todo.getState() == State.COMPLETED);
    }
}
