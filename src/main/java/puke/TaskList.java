package puke;

import java.util.ArrayList;

/**
 * TaskList with list manipulating options
 */
public class TaskList {
    /**
     * field to store the tasks
     */
    protected ArrayList<Task> tasks = new ArrayList<>();

    /**
     * how many tasks in the list
     */
    protected int numTasks = tasks.size();
    protected int removed = 0;

    /**
     * Creates a TaskList
     * @param s ArrayList to store tasks in Tasklist class
     */
    public TaskList(ArrayList<Task> s) {
        this.tasks = s;
        this.numTasks = tasks.size();
        this.removed = 0;
    }

    /**
     * Lists all the tasks that are currently in the list
     */
    public void listTasks() {
        System.out.println("    ____________________________________________________________");
        System.out.println("     Here are the tasks in your list:");
        for(int i = 0; i < this.tasks.size() ; i++) {
            System.out.println("     " + (i+1) + "." + this.tasks.get(i));
        }
        System.out.println("    ____________________________________________________________");
        return;
    }

    /**
     * Adds a tasks to the list
     * @param t task to add
     */
    public void addIncrement(Task t) {
        this.tasks.add(t);
        this.numTasks++;
    }

    /**
     * Deletes a task from the list
     * @param index position of task on the list to delete
     */
    public void delete(int index) {
        this.tasks.remove(index);
        this.removed++;
    }

} 
