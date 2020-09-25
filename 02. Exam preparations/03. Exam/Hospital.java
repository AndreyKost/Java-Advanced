import java.util.*;

public class Hospital {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Map<String, ArrayList<String>> departmentsRooms=new LinkedHashMap<>();
        Map<String, ArrayList<String>> doctorPatients=new LinkedHashMap<>();

        String line=scanner.nextLine();
        while (!line.equals("Output")){
            String tokens[]=line.split(" ");
            String department=tokens[0];
            String doctorName=tokens[1]+" "+tokens[2];
            String patientName=tokens[3];

            if(departmentsRooms.containsKey(department)){
                if(departmentsRooms.get(department).size()<60){
                    departmentsRooms.get(department).add(patientName);
                } else {
                    continue;
                }
            } else {
                departmentsRooms.put(department,new ArrayList<>());
                departmentsRooms.get(department).add(patientName);
            }

            if(doctorPatients.containsKey(doctorName)){
                doctorPatients.get(doctorName).add(patientName);
            } else {
                doctorPatients.put(doctorName,new ArrayList<>());
                doctorPatients.get(doctorName).add(patientName);
            }


            line=scanner.nextLine();
        }

        String command=scanner.nextLine();

        while (!command.equals("End")){
            TreeSet<String> rms=new TreeSet<>();
            if(command.contains(" ")){
                String tokens[]=command.split(" ");
                if(Character.isDigit(tokens[1].charAt(0))){
                    for (Map.Entry<String, ArrayList<String>> entry : departmentsRooms.entrySet()) {
                        if(entry.getKey().equals(tokens[0])){
                            ArrayList<String> rooms=entry.getValue();
                            int n=Integer.parseInt(tokens[1]);
                            for (int i = n*3; i >=(n*3)-3 ; i--) {
                                if(i-1<rooms.size() && i-1>=0){
                                    rms.add(rooms.get(i-1));
                                }
                            }
                            break;
                        }
                    }
                    for (String rm : rms) {
                        System.out.println(rm);
                    }
                }  else {
                    String nameOfDoctor=tokens[0]+" "+tokens[1];
                    for (Map.Entry<String, ArrayList<String>> entry : doctorPatients.entrySet()) {
                        if(entry.getKey().equals(nameOfDoctor)){
                            ArrayList<String> names=entry.getValue();
                            Collections.sort(names);
                            for (String name : names) {
                                System.out.println(name);
                            }
                            break;
                        }
                    }

                }
            } else {
                for (Map.Entry<String, ArrayList<String>> entry : departmentsRooms.entrySet()) {
                    if(entry.getKey().equals(command)){
                        ArrayList<String> asd=entry.getValue();
                        for (int i = 0; i <asd.size() ; i++) {
                            System.out.println(asd.get(i));
                        }
                    }
                }

            }




            command=scanner.nextLine();
        }



    }


}