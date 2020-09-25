import java.util.Scanner;

public class BookWorm {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String line=scanner.nextLine();
        int[] playerPos=new int[2];
        StringBuilder txt=new StringBuilder();
        for (int i = 0; i <line.length() ; i++) {
            txt.append(line.charAt(i));
        }



        int N=Integer.parseInt(scanner.nextLine());
        char[][] field=new char[N][N];

        for (int r = 0; r <N ; r++) {
            String str=scanner.nextLine();
            if(str.contains("P")){
                playerPos[0]=r;
                playerPos[1]=str.indexOf('P');
            }
            field[r]=str.toCharArray();
        }



        String command=scanner.nextLine();

        while (!command.equals("end")){
            movePlayer(field,playerPos,command,txt);




            command=scanner.nextLine();
        }


        System.out.println(txt.toString());

        for (int row = 0; row <N ; row++) {
            for (int col = 0; col <N ; col++) {
                System.out.print(field[row][col]);
            }
            System.out.println();
        }



    }

    private static void movePlayer(char[][] field, int[] playerPos, String command, StringBuilder txt) {
        if(command.equals("up")){
            if(playerPos[0]-1<0){
                txt.deleteCharAt(txt.length()-1);
                /*String str=line.substring(0,line.length()-1);
                line=str;*/
            } else {
                field[playerPos[0]][playerPos[1]]='-';
                playerPos[0]-=1;
                if(field[playerPos[0]][playerPos[1]]!='-'){
                    //line=""+field[playerPos[0]][playerPos[1]];
                    /*String s=""+field[playerPos[0]][playerPos[1]];
                    line=line.concat(s);*/
                    txt.append(field[playerPos[0]][playerPos[1]]);
                    field[playerPos[0]][playerPos[1]] = 'P';
                } else {
                    field[playerPos[0]][playerPos[1]]='P';
                }

            }





        } else if(command.equals("down")){



            if(playerPos[0]+1>=field.length){
                txt.deleteCharAt(txt.length()-1);
                /*String str=line.substring(0,line.length()-1);
                line=str;*/
            } else {
                field[playerPos[0]][playerPos[1]] = '-';
                playerPos[0] += 1;
                if (field[playerPos[0]][playerPos[1]] != '-') {
                    /*String s=""+field[playerPos[0]][playerPos[1]];
                    line=line.concat(s);*/
                    txt.append(field[playerPos[0]][playerPos[1]]);
                    field[playerPos[0]][playerPos[1]] = 'P';
                } else {
                    field[playerPos[0]][playerPos[1]] = 'P';
                }

            }

        } else if(command.equals("left")){


            if(playerPos[1]-1<0) {
                txt.deleteCharAt(txt.length()-1);
                /*String str=line.substring(0,line.length()-1);
                line=str;*/
            } else {
                field[playerPos[0]][playerPos[1]]='-';
                playerPos[1]-=1;
                if(field[playerPos[0]][playerPos[1]]!='-'){
                    /*String s=""+field[playerPos[0]][playerPos[1]];
                    line=line.concat(s);*/
                    txt.append(field[playerPos[0]][playerPos[1]]);
                    field[playerPos[0]][playerPos[1]] = 'P';
                } else {
                    field[playerPos[0]][playerPos[1]] = 'P';
                }
            }




        } else if(command.equals("right")){



            if(playerPos[1]+1>=field.length) {
                txt.deleteCharAt(txt.length()-1);
                /*String str=line.substring(0,line.length()-1);
                line=str;*/
            } else {
                field[playerPos[0]][playerPos[1]]='-';
                playerPos[1]+=1;
                if(field[playerPos[0]][playerPos[1]]!='-'){
                    /*String s=""+field[playerPos[0]][playerPos[1]];
                    line=line.concat(s);*/
                    txt.append(field[playerPos[0]][playerPos[1]]);
                    field[playerPos[0]][playerPos[1]] = 'P';
                } else {
                    field[playerPos[0]][playerPos[1]] = 'P';
                }
            }







        }



    }
}
