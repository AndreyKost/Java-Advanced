import java.util.*;

public class Hospital2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String input=scanner.nextLine();
        Map<String, String[][]> departmens=new HashMap<>();
        Map<String, TreeSet<String>> doctorsAndPatients=new HashMap<>();

        while (!input.equals("Output")){
            String tokens[]=input.split(" ");
            String department=tokens[0];
            String doctor=tokens[1] +" "+tokens[2];
            String patient=tokens[3];

            if(!departmens.containsKey(department)){
                departmens.put(department, new String[20][3]);
            }

            boolean patientAdded=false;
            for (int i = 0; i <departmens.get(department).length ; i++) {
                for (int j = 0; j <departmens.get(department)[i].length ; j++) {
                    if(departmens.get(department)[i][j]==null){
                        departmens.get(department)[i][j]=patient;
                        patientAdded=true;
                        break;
                    }
                }
                if(patientAdded){
                    break;
                }
            }

            if(!doctorsAndPatients.containsKey(doctor)){
                doctorsAndPatients.put(doctor, new TreeSet<>());
            }

            if(patientAdded) {
                doctorsAndPatients.get(doctor).add(patient);
            }


            input=scanner.nextLine();
        }

        input=scanner.nextLine();

        while (!input.equals("End")){
            String tokens[]=input.split(" ");
            if(tokens.length==1){
                String department=tokens[0];
                /*Arrays.stream(departmens.get(department)).forEach(e->{
                    Arrays.stream(e).filter(Objects::nonNull).forEach(System.out::println);
                });*/

                for (int i = 0; i <departmens.get(department).length ; i++) {
                    for (int j = 0; j <departmens.get(department)[i].length ; j++) {
                        if(departmens.get(department)[i][j]!=null){
                            System.out.println(departmens.get(department)[i][j]);
                        }
                    }
                }

            } else if (tokens.length==2){
                if(Character.isDigit(tokens[1].charAt(0))){
                    String department=tokens[0];
                    int room=Integer.parseInt(tokens[1])-1;

                    String[] patients=departmens.get(department)[room];
                    Arrays.stream(patients).filter(Objects::nonNull).sorted(String::compareTo).forEach(System.out::println);


                } else {
                    String doctor=tokens[0]+" "+tokens[1];
                    doctorsAndPatients.get(doctor).forEach(System.out::println);

                }
            }



            input=scanner.nextLine();
        }

    }
}
