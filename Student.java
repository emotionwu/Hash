public class Student {

    int grade;
    int cls;
    String firstName;
    String lastName;

    Student(int grade,int cls,String firstName, String lastName){
        this.grade=grade;
        this.cls=cls;
        this.firstName=firstName;
        this.lastName=lastName;
    }

    //可能会产生哈希冲突
    @Override
    public int hashCode(){

        int B=31;

        int hash=0;
        hash = hash*B+grade;
        hash = hash*B +cls;
        //转换成小写，再转换为hash
        hash = hash *B +firstName.toLowerCase().hashCode();
        hash = hash *B+lastName.toLowerCase().hashCode();

        return hash;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null)
            return false;

        if (getClass() != o.getClass())
            return false;

        Student another = (Student) o;
        return another.grade == this.grade ;
    }
}
