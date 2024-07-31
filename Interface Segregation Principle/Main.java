/* interface Worker {
    void work();
    void attendMeetings();
    void eat();
} */

/* i just divided the method into one. */


interface worker {
    void work();
}

interface workerMeet{
    void attendMeetings();
}

interface workerMeal{
    void eat();
}

class Employee implements worker, workerMeal{
    @Override
    public void work(){
        System.out.println("This is an employee class.");
    }

    @Override
    public void eat(){
        System.out.println("This is an employee class who is eating.");
    }
}

class Manager implements workerMeet{
    @Override
    public void attendMeetings(){
        System.out.println("This is a manager class who is attending an event in the meeting.");
    }
}
