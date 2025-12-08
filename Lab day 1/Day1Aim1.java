class Day1Aim1 {

    static class MyClass {

        String Name = "Sweekar Dahal";
        int RollNo = 24052780;
        String Section = "CSE 9";
        String Branch = "B.tech CSE";

        void display() {
            System.out.println("Name: " + Name);
            System.out.println("Roll No: " + RollNo);
            System.out.println("Section: " + Section);
            System.out.println("Branch: " + Branch);
        }

    }

    public static void main(String args[]) {
        MyClass obj = new MyClass();
        obj.display();

    }
}
