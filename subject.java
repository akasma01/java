class subject extends student{
    float [] marks= new float[3];
    float sum,per;

    void set_marks()
    {
        for(int i=0;i<3;i++)
        {
            System.out.println("Enter marks for subject "+(i+1));
            marks[i]=Float.parseFloat(s.nextLine());
            sum+=marks[i];  
        }

        System.out.println("Marks enterd succesffuly");
    }

    void result()
    {
        per=sum/3;
        // System.out.println("Student Roll :" + course );
        // System.out.println("Student Name :" + name );
        //this.show_stud();
        System.out.println("Student Percentage :" + per );
    }

    public static void main(String[] args) {
        

        subject st = new subject();
        //student su = new student();
        //System.out.println(st.course);
        st.get_stud();
        st.set_marks();
        st.result();

    }
}
