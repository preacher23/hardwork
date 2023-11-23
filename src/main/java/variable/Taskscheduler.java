package variable;


class Taskscheduling {
    public String compute() {
        return "computing data";
    }

    public String save() {
        return "save data to datbases";
    }

    public String sendnotification() {
        return "notification";
    }
}
    class Scheduling{
        private Taskscheduling ts;
        public Scheduling(Taskscheduling ts){
            this.ts=ts;
        }
        public void Schedule(){
            System.out.println( ts.compute());
        }
    }

public class Taskscheduler {
    public static void main(String[] args) {
    Scheduling scheduling=new Scheduling(new Taskscheduling());
    scheduling.Schedule();

    }
}
