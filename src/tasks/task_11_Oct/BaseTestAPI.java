package tasks.task_11_Oct;

/* Create a Runner - APIAutomation (HTTP Method) having:
1. method - string name, id (int)
2. BaseTest API
    1. performGET()
    2. performPOST()
    3. performPATCH()
    4. performPUT()
    5. performDELETE()
3. TestCaseAPI
4. Use Encapsulation, Poly, Single, Dynamic, Super, this in the program
 */

public abstract class BaseTestAPI {
    private String name; //Used Encapsulation
    private int id;

BaseTestAPI(){
    System.out.println("Default Const"); //Used DC
}
    BaseTestAPI(String name, int id){
        System.out.println("Parametrized Const"); //Used PC
    }

    //Used getter, setter for both variables
    public String getName() {
        return name;
    }

    public void setName(String name) {
    if(name == "Sam") {
        System.out.println("Access ID");
        this.name = name;
    }
    else{
        System.out.println("Not allowed to access");
    }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    //Used methods/behaviors
    void performGET(String name, int id){ //Used Method Overloading (Polymorphism)
        System.out.println("Perform GET in API");
    }
    void performPOST(){
        System.out.println("Perform POST in API");
    }
    void performPATCH(){
        System.out.println("Perform PATCH in API");
    }
    void performPUT(){
        System.out.println("Perform PUT in API");
    }
    void performDELETE(){
        System.out.println("Perform DELETE in API");
    }

}
