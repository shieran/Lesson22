//public class Person {
//
//    String name;
//
//    public Person(String name) {
//        this.name = name;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public static String writePersonToFile(Person person){
//        System.out.println(person.getName());
//        String fileName = person.getName();
//        if (fileName == null || fileName.isEmpty()){
//            person.setName("empty-person");
//        }
//        fileName = person.getName() + ".txt";
//        writePerson(person);
//        return fileName;
//    }
//
//    public static String personToFileAndGetFileName(Person person){
//        String personName = person.getName();
//        String fileName = personName == null || personName.isEmpty() ? "empty-person" : personName;
//        fileName += ".txt";
//        boolean isFileWritten = writePerson(person, fileName);
//        return isFileWritten? fileName : " ";
//
//    }
//
//    public static void writePerson(Person person){
//        //code to write to file
//    }
//
//    public static boolean writePerson(Person person, String fileName){
//        //code to write to file
//        return true;
//    }
//}
//
