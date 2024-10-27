package tasks.task_11_Oct;

public class TestCaseAPI extends BaseTestAPI //Used single inheritance
{
    TestCaseAPI() {
        super(); //Used Super Keyword
        this.performGET("Sam", 201);
    }

    TestCaseAPI(String name, int id) {
        super(name, id);
    }

    public void setBrowser(String name, int id) {
        System.out.println("First API run");
        super.performGET(name,id);

    }
}
