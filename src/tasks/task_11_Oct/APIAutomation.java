package tasks.task_11_Oct;

public class APIAutomation {
    public static void main(String[] args) {
            BaseTestAPI t1 = new TestCaseAPI(); //Dynamic Dispatch
            t1.performPOST();
            t1.performPATCH();
        }
}
