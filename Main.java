import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);//scanner for input information
        Company c = new Company();//a new computer company object
        Data_Base d = new Data_Base();
        Storage s;
        s = new Storage();
        System.out.println();
        System.out.println("welcome to the computer's company tycoon !");
        System.out.println();

        //get the name of computer's company
        System.out.print("Enter your computer's company name : ");
        c.name=scan.nextLine();
        System.out.println();
        System.out.println("Welcome to the "+c.name+" computer's company !");
        System.out.println();
        System.out.println("**********************************************************");
        int i_number=0;


        /*start the game*/
        while (true){
            int choose;
            System.out.println();
            System.out.println("1- company statistics");
            System.out.println("2- store");
            System.out.println("3- storage");
            System.out.println("4- computer factory");
            System.out.println("5- hardware sell");
            System.out.println("6- computer history");
            System.out.println("7- guide");
            System.out.println("8- exit");
            System.out.println();
            System.out.print("Select a section : ");
            choose=scan.nextInt();
            System.out.println();
            if(choose==1){
                c.statistics();
            }
            else if(choose==2){
                while(true){
                    int section;
                    System.out.println("**********************************************************");
                    System.out.println();
                    System.out.println("Welcome to store !");
                    System.out.println();
                    System.out.println("1-Computer Case");
                    System.out.println("2-Mother Board");
                    System.out.println("3-CPU");
                    System.out.println("4-RAM");
                    System.out.println("5-Hard Drive");
                    System.out.println("6-Graphic Card");
                    System.out.println("7-Disk Drive");
                    System.out.println("8-Monitor");
                    System.out.println("9-Power");
                    System.out.println("10-Exit");
                    System.out.println();
                    System.out.print("Select a section : ");
                    section=scan.nextInt();
                    System.out.println();

                    if(section==1){
                        while(true){
                            System.out.println("**********************************************************");
                            System.out.println();
                            /* case's in 1970*/

                            Case c1 = new Case("simple board"," ",2.0,"wood");
                            Case c2 = new Case("normal board"," ",5.0,"compact plastic");
                            Case c3 = new Case("hand-made case"," ",10.0,"wood");
                            Case c4 = new Case("pre-made case"," ",15.0,"compact plastic");

                            Case  [] products  ={c1,c2,c3,c4};

                            int select;
                            System.out.println("Computer Case List : ");
                            System.out.println();
                            for(int i=0;i<products.length;i++){
                                System.out.println((i+1)+"- "+products[i].name+" "+products[i].price+"$");
                            }
                            System.out.println((products.length+1)+"- "+"Exit");
                            System.out.println();
                            System.out.print("Select a section : ");
                            select = scan.nextInt();
                            System.out.println();

                            if(select>0 && select<=products.length){
                                int select2;
                                System.out.println("**********************************************************");
                                System.out.println();
                                System.out.println("Products Information : ");
                                System.out.println();
                                System.out.println("Products name : "+products[select-1].name);
                                System.out.println("Products Company : "+products[select-1].company);
                                System.out.println("Products Material : "+products[select-1].material);
                                System.out.println("Price : "+products[select-1].price+"$");
                                System.out.println();
                                System.out.print("Are you sure to buy that ? Enter 1 for yes or 2 for no : ");
                                select2=scan.nextInt();
                                System.out.println();
                                switch (select2){
                                    case 1:{
                                        if(s.computer_case[0]==null){
                                            if(c.money>=products[select-1].price) {
                                                s.computer_case[0] = products[select - 1];
                                                c.money -= products[select - 1].price;
                                                System.out.println("Thanks for your purchase !");
                                                System.out.println();

                                            }
                                            else {
                                                System.out.println("Your need more money to buy that.");
                                                System.out.println();
                                            }
                                        }
                                        else{
                                            System.out.println("You buy this part before");
                                            System.out.println();
                                            break;
                                        }

                                    }
                                    case 2:{
                                        break;
                                    }
                                    default:{
                                        System.out.println("Select a valid section.");
                                        System.out.println();
                                    }
                                }
                                break;
                            }
                            else if(select==products.length+1){
                                System.out.println();
                                break;

                            }
                            else{
                                System.out.println("Select a valid section");
                            }
                        }
                    }
                    else if(section==2){
                        while(true){
                            System.out.println("**********************************************************");
                            System.out.println();
                            /*motherboard's in 1970*/

                            MotherBoard m1 = new MotherBoard("Simple Board"," ",15.0," ");
                            MotherBoard m2 = new MotherBoard("Geeks Board"," ",20.0," ");
                            MotherBoard m3 = new MotherBoard("Engineering Board"," ",30.0," ");
                            MotherBoard  [] products  ={m1,m2,m3};

                            int select;
                            System.out.println("Computer Boards List : ");
                            System.out.println();
                            for(int i=0;i<products.length;i++){
                                System.out.println((i+1)+"- "+products[i].name+" "+products[i].price+"$");
                            }
                            System.out.println((products.length+1)+"- "+"Exit");
                            System.out.println();
                            System.out.print("Select a section : ");
                            select = scan.nextInt();
                            System.out.println();

                            if(select>0 && select<=products.length){
                                int select2;
                                System.out.println("**********************************************************");
                                System.out.println();
                                System.out.println("Products Information : ");
                                System.out.println();
                                System.out.println("Products name : "+products[select-1].name);
                                System.out.println("Products Company : "+products[select-1].company);
                                System.out.println("Products Model : "+products[select-1].model);
                                System.out.println("Price : "+products[select-1].price+"$");
                                System.out.println();
                                System.out.print("Are you sure to buy that ? Enter 1 for yes or 2 for no : ");
                                select2=scan.nextInt();
                                System.out.println();
                                switch (select2){
                                    case 1:{
                                        if(s.motherboard[0]==null){
                                            if(c.money>=products[select-1].price) {
                                                s.motherboard[0] = products[select - 1];
                                                c.money -= products[select - 1].price;
                                                System.out.println("Thanks for your purchase !");
                                                System.out.println();

                                            }
                                            else {
                                                System.out.println("Your need more money to buy that.");
                                                System.out.println();
                                            }

                                        }
                                        else {
                                            System.out.println("You buy this part before");
                                            System.out.println();
                                            break;
                                        }

                                    }
                                    case 2:{
                                        break;
                                    }
                                    default:{
                                        System.out.println("Select a valid section.");
                                        System.out.println();
                                    }
                                }
                                break;
                            }
                            else if(select==products.length+1){
                                System.out.println();
                                break;

                            }
                            else{
                                System.out.println("Select a valid section");
                            }

                        }
                    }
                    else if(section==3){
                        while(true){
                            System.out.println("**********************************************************");
                            System.out.println();

                            /*CPU's in 1970*/

                            Cpu c1 = new Cpu("Intel 4004","Intel",1,5.0,740);
                            Cpu c2 = new Cpu("Intel 8080","Intel",1,15.0,2000);
                            Cpu  [] products  ={c1,c2};

                            int select;
                            System.out.println("Computer CPU's List : ");
                            System.out.println();
                            for(int i=0;i<products.length;i++){
                                System.out.println((i+1)+"- "+products[i].name+" "+products[i].price+"$");
                            }
                            System.out.println((products.length+1)+"- "+"Exit");
                            System.out.println();
                            System.out.print("Select a section : ");
                            select = scan.nextInt();
                            System.out.println();

                            if(select>0 && select<=products.length){
                                int select2;
                                System.out.println("**********************************************************");
                                System.out.println();
                                System.out.println("Products Information : ");
                                System.out.println();
                                System.out.println("Products name : "+products[select-1].name);
                                System.out.println("Products Company : "+products[select-1].company);
                                System.out.println("Products Core : "+products[select-1].core);
                                System.out.println("Products Frequency : "+products[select-1].frequency+"KHz");
                                System.out.println("Price : "+products[select-1].price+"$");
                                System.out.println();
                                System.out.print("Are you sure to buy that ? Enter 1 for yes or 2 for no : ");
                                select2=scan.nextInt();
                                System.out.println();
                                switch (select2){
                                    case 1:{
                                        if(s.cpu[0]==null){
                                            if(c.money>=products[select-1].price) {
                                                s.cpu[0] = products[select - 1];
                                                c.money -= products[select - 1].price;
                                                System.out.println("Thanks for your purchase !");
                                                System.out.println();

                                            }else {
                                                System.out.println("Your need more money to buy that.");
                                                System.out.println();
                                            }
                                        }
                                        else{
                                            System.out.println("You Buy this part before.");
                                            System.out.println();
                                        }

                                    }
                                    case 2:{
                                        break;
                                    }
                                    default:{
                                        System.out.println("Select a valid section.");
                                        System.out.println();
                                    }
                                }
                                break;
                            }
                            else if(select==products.length+1){
                                System.out.println();
                                break;

                            }
                            else{
                                System.out.println("Select a valid section");
                            }

                        }

                    }
                    else if(section==4){
                        while(true){

                            System.out.println("**********************************************************");
                            System.out.println();

                            /*RAM's in 1970*/

                            Ram r1 = new Ram("Intel 1103","Intel",5.0," ",1024," ");
                            Ram  [] products  ={r1};

                            int select;
                            System.out.println("Computer RAM's List : ");
                            System.out.println();
                            for(int i=0;i<products.length;i++){
                                System.out.println((i+1)+"- "+products[i].name+" "+products[i].price+"$");
                            }
                            System.out.println((products.length+1)+"- "+"Exit");
                            System.out.println();
                            System.out.print("Select a section : ");
                            select = scan.nextInt();
                            System.out.println();

                            if(select>0 && select<=products.length){
                                int select2;
                                System.out.println("**********************************************************");
                                System.out.println();
                                System.out.println("Products Information : ");
                                System.out.println();
                                System.out.println("Products name : "+products[select-1].name);
                                System.out.println("Products Company : "+products[select-1].company);
                                System.out.println("Products Model : "+products[select-1].model);
                                System.out.println("Products Capacity : "+products[select-1].capacity+"Kb");
                                System.out.println("Products Memory Model : "+products[select-1].memory_model);
                                System.out.println("Price : "+products[select-1].price+"$");
                                System.out.println();
                                System.out.print("Are you sure to buy that ? Enter 1 for yes or 2 for no : ");
                                select2=scan.nextInt();
                                System.out.println();
                                switch (select2){
                                    case 1:{
                                        if(s.ram[0]==null){
                                            if(c.money>=products[select-1].price) {
                                                s.ram[0] = products[select - 1];
                                                c.money -= products[select - 1].price;
                                                System.out.println("Thanks for your purchase !");
                                                System.out.println();

                                            }else {
                                                System.out.println("Your need more money to buy that.");
                                                System.out.println();
                                            }
                                        }
                                        else{
                                            System.out.println("You buy this part before");
                                            System.out.println();
                                            break;
                                        }

                                    }
                                    case 2:{
                                        break;
                                    }
                                    default:{
                                        System.out.println("Select a valid section.");
                                        System.out.println();
                                    }
                                }
                                break;
                            }
                            else if(select==products.length+1){
                                System.out.println();
                                break;

                            }
                            else{
                                System.out.println("Select a valid section");
                            }

                        }
                    }
                    else if(section==5){
                        while(true){

                            System.out.println("**********************************************************");
                            System.out.println();

                            /*Hard Drive's in 1970*/

                            Hard_Drive h1 = new Hard_Drive("Hard Drive 1","Hard Drive Making",5.0," "," ",5000);
                            Hard_Drive[] products  ={h1};

                            int select;
                            System.out.println("Computer Hard Drive's List : ");
                            System.out.println();
                            for(int i=0;i<products.length;i++){
                                System.out.println((i+1)+"- "+products[i].name+" "+products[i].price+"$");
                            }
                            System.out.println((products.length+1)+"- "+"Exit");
                            System.out.println();
                            System.out.print("Select a section : ");
                            select = scan.nextInt();
                            System.out.println();

                            if(select>0 && select<=products.length){
                                int select2;
                                System.out.println("**********************************************************");
                                System.out.println();
                                System.out.println("Products Information : ");
                                System.out.println();
                                System.out.println("Products name : "+products[select-1].name);
                                System.out.println("Products Company : "+products[select-1].company);
                                System.out.println("Products Model : "+products[select-1].model);
                                System.out.println("Products Capacity : "+products[select-1].capacity+"Kb");
                                System.out.println("Products Memory Type : "+products[select-1].type);
                                System.out.println("Price : "+products[select-1].price+"$");
                                System.out.println();
                                System.out.print("Are you sure to buy that ? Enter 1 for yes or 2 for no : ");
                                select2=scan.nextInt();
                                System.out.println();
                                switch (select2){
                                    case 1:{
                                        if(s.hard_drive[0]==null){
                                            if(c.money>=products[select-1].price) {
                                                s.hard_drive[0] = products[select - 1];
                                                c.money -= products[select - 1].price;
                                                System.out.println("Thanks for your purchase !");
                                                System.out.println();

                                            }else {
                                                System.out.println("Your need more money to buy that.");
                                                System.out.println();
                                            }
                                        }
                                        else{
                                            System.out.println("You buy this part before");
                                            System.out.println();
                                            break;
                                        }

                                    }
                                    case 2:{
                                        break;
                                    }
                                    default:{
                                        System.out.println("Select a valid section.");
                                        System.out.println();
                                    }
                                }
                                break;
                            }
                            else if(select==products.length+1){
                                System.out.println();
                                break;

                            }
                            else{
                                System.out.println("Select a valid section");
                            }

                        }
                    }
                    else if(section==6){
                        while(true){

                            System.out.println("**********************************************************");
                            System.out.println();

                            /*Graphic Card's in 1970*/

                            Graphic_Card g1 = new Graphic_Card("Graphic1","AMD",15,"s1",1024);
                            Graphic_Card[] products  ={g1};

                            int select;
                            System.out.println("Computer Hard Drive's List : ");
                            System.out.println();
                            for(int i=0;i<products.length;i++){
                                System.out.println((i+1)+"- "+products[i].name+" "+products[i].price+"$");
                            }
                            System.out.println((products.length+1)+"- "+"Exit");
                            System.out.println();
                            System.out.print("Select a section : ");
                            select = scan.nextInt();
                            System.out.println();

                            if(select>0 && select<=products.length){
                                int select2;
                                System.out.println("**********************************************************");
                                System.out.println();
                                System.out.println("Products Information : ");
                                System.out.println();
                                System.out.println("Products name : "+products[select-1].name);
                                System.out.println("Products Company : "+products[select-1].company);
                                System.out.println("Products Memory Type : "+products[select-1].memory_type);
                                System.out.println("Products Capacity : "+products[select-1].capacity+"Kb");
                                System.out.println("Price : "+products[select-1].price+"$");
                                System.out.println();
                                System.out.print("Are you sure to buy that ? Enter 1 for yes or 2 for no : ");
                                select2=scan.nextInt();
                                System.out.println();
                                switch (select2){
                                    case 1:{
                                        if(s.graphic_card[0]==null){
                                            if(c.money>=products[select-1].price) {
                                                s.graphic_card[0] = products[select - 1];
                                                c.money -= products[select - 1].price;
                                                System.out.println("Thanks for your purchase !");
                                                System.out.println();

                                            }else {
                                                System.out.println("Your need more money to buy that.");
                                                System.out.println();
                                            }
                                        }
                                        else{
                                            System.out.println("you buy this part before");
                                            System.out.println();
                                            break;
                                        }

                                    }
                                    case 2:{
                                        break;
                                    }
                                    default:{
                                        System.out.println("Select a valid section.");
                                        System.out.println();
                                    }
                                }
                                break;
                            }
                            else if(select==products.length+1){
                                System.out.println();
                                break;

                            }
                            else{
                                System.out.println("Select a valid section");
                            }

                        }
                    }
                    else if(section==7){
                        while(true){

                            System.out.println("**********************************************************");
                            System.out.println();

                            /*Disk Drive's in 1970*/

                            Disk_Drive d1 = new Disk_Drive("CD ROM","HP",15.0,"Type 1","s1");
                            Disk_Drive[] products  ={d1};

                            int select;
                            System.out.println("Computer Disk Drive's List : ");
                            System.out.println();
                            for(int i=0;i<products.length;i++){
                                System.out.println((i+1)+"- "+products[i].name+" "+products[i].price+"$");
                            }
                            System.out.println((products.length+1)+"- "+"Exit");
                            System.out.println();
                            System.out.print("Select a section : ");
                            select = scan.nextInt();
                            System.out.println();

                            if(select>0 && select<=products.length){
                                int select2;
                                System.out.println("**********************************************************");
                                System.out.println();
                                System.out.println("Products Information : ");
                                System.out.println();
                                System.out.println("Products name : "+products[select-1].name);
                                System.out.println("Products Company : "+products[select-1].company);
                                System.out.println("Products Model : "+products[select-1].model);
                                System.out.println("Products Type : "+products[select-1].type+"Kb");
                                System.out.println("Price : "+products[select-1].price+"$");
                                System.out.println();
                                System.out.print("Are you sure to buy that ? Enter 1 for yes or 2 for no : ");
                                select2=scan.nextInt();
                                System.out.println();
                                switch (select2){
                                    case 1:{
                                        if(s.disk_drive[0]==null){
                                            if(c.money>=products[select-1].price) {
                                                s.disk_drive[0] = products[select - 1];
                                                c.money -= products[select - 1].price;
                                                System.out.println("Thanks for your purchase !");
                                                System.out.println();

                                            }else {
                                                System.out.println("Your need more money to buy that.");
                                                System.out.println();
                                            }
                                        }
                                        else{
                                            System.out.println("You buy this part before");
                                            System.out.println();
                                            break;
                                        }

                                    }
                                    case 2:{
                                        break;
                                    }
                                    default:{
                                        System.out.println("Select a valid section.");
                                        System.out.println();
                                    }
                                }
                                break;
                            }
                            else if(select==products.length+1){
                                System.out.println();
                                break;

                            }
                            else{
                                System.out.println("Select a valid section");
                            }

                        }
                    }
                    else if(section==8){
                        while(true){

                            System.out.println("**********************************************************");
                            System.out.println();

                            /*Monitor's in 1970*/

                            Monitor m1 = new Monitor("Monitor 1","Apple",10,"Type 1","Pro",10.5);
                            Monitor[] products  ={m1};

                            int select;
                            System.out.println("Computer Monitors List : ");
                            System.out.println();
                            for(int i=0;i<products.length;i++){
                                System.out.println((i+1)+"- "+products[i].name+" "+products[i].price+"$");
                            }
                            System.out.println((products.length+1)+"- "+"Exit");
                            System.out.println();
                            System.out.print("Select a section : ");
                            select = scan.nextInt();
                            System.out.println();

                            if(select>0 && select<=products.length){
                                int select2;
                                System.out.println("**********************************************************");
                                System.out.println();
                                System.out.println("Products Information : ");
                                System.out.println();
                                System.out.println("Products name : "+products[select-1].name);
                                System.out.println("Products Company : "+products[select-1].company);
                                System.out.println("Products Model : "+products[select-1].model);
                                System.out.println("Products Type : "+products[select-1].type);
                                System.out.println("Products Size : "+products[select-1].size+" Inch");
                                System.out.println("Price : "+products[select-1].price+"$");
                                System.out.println();
                                System.out.print("Are you sure to buy that ? Enter 1 for yes or 2 for no : ");
                                select2=scan.nextInt();
                                System.out.println();
                                switch (select2){
                                    case 1:{
                                        if(s.monitor[0]==null){
                                            if(c.money>=products[select-1].price) {
                                                s.monitor[0] = products[select - 1];
                                                c.money -= products[select - 1].price;
                                                System.out.println("Thanks for your purchase !");
                                                System.out.println();

                                            }else {
                                                System.out.println("Your need more money to buy that.");
                                                System.out.println();
                                            }
                                        }
                                        else{
                                            System.out.println("You buy this part before");
                                            System.out.println();
                                            break;
                                        }

                                    }
                                    case 2:{
                                        break;
                                    }
                                    default:{
                                        System.out.println("Select a valid section.");
                                        System.out.println();
                                    }
                                }
                                break;
                            }
                            else if(select==products.length+1){
                                System.out.println();
                                break;

                            }
                            else{
                                System.out.println("Select a valid section");
                            }

                        }
                    }
                    else if(section==9){
                        while(true){

                            System.out.println("**********************************************************");
                            System.out.println();

                            /*Power in 1970*/

                            Power p1 = new Power("Power1"," ",5.0," ","",10);
                            Power[] products  ={p1};

                            int select;
                            System.out.println("Computer Powers List : ");
                            System.out.println();
                            for(int i=0;i<products.length;i++){
                                System.out.println((i+1)+"- "+products[i].name+" "+products[i].price+"$");
                            }
                            System.out.println((products.length+1)+"- "+"Exit");
                            System.out.println();
                            System.out.print("Select a section : ");
                            select = scan.nextInt();
                            System.out.println();

                            if(select>0 && select<=products.length){
                                int select2;
                                System.out.println("**********************************************************");
                                System.out.println();
                                System.out.println("Products Information : ");
                                System.out.println();
                                System.out.println("Products name : "+products[select-1].name);
                                System.out.println("Products Company : "+products[select-1].company);
                                System.out.println("Products Model : "+products[select-1].model);
                                System.out.println("Products Type : "+products[select-1].type);
                                System.out.println("Products Might : "+products[select-1].might+" W");
                                System.out.println("Price : "+products[select-1].price+"$");
                                System.out.println();
                                System.out.print("Are you sure to buy that ? Enter 1 for yes or 2 for no : ");
                                select2=scan.nextInt();
                                System.out.println();
                                switch (select2){
                                    case 1:{
                                        if(s.power[0]==null){
                                            if(c.money>=products[select-1].price) {
                                                s.power[0] = products[select - 1];
                                                c.money -= products[select - 1].price;
                                                System.out.println("Thanks for your purchase !");
                                                System.out.println();

                                            }else {
                                                System.out.println("Your need more money to buy that.");
                                                System.out.println();
                                            }
                                        }
                                        else {
                                            System.out.println("You buy this part before");
                                            System.out.println();
                                            break;
                                        }

                                    }
                                    case 2:{
                                        break;
                                    }
                                    default:{
                                        System.out.println("Select a valid section.");
                                        System.out.println();
                                    }
                                }
                                break;
                            }
                            else if(select==products.length+1){
                                System.out.println();
                                break;

                            }
                            else{
                                System.out.println("Select a valid section");
                            }

                        }
                    }
                    else if(section==10){
                        break;
                    }
                    else{
                        System.out.println("Please select a valid section.");
                    }
                }


            }
            else if(choose==3){
                while(true){

                    System.out.println("**********************************************************");
                    System.out.println();
                    System.out.println("Welcome to storage !");
                    System.out.println();
                    int section;
                    System.out.println("1-Case");
                    System.out.println("2-Mother Board ");
                    System.out.println("3-CPU ");
                    System.out.println("4-RAM ");
                    System.out.println("5-Hard Drive ");
                    System.out.println("6-Graphic Card ");
                    System.out.println("7-Disk Drive ");
                    System.out.println("8-Monitor ");
                    System.out.println("9-Power ");
                    System.out.println("10-Exit");
                    System.out.println();
                    System.out.print("Select a section : ");
                    section=scan.nextInt();
                    System.out.println();
                    if(section==1){
                        if(s.computer_case[0]!=null){
                            s.computer_case[0].information();
                        }
                        else if(s.computer_case[0]==null) {
                            System.out.println("You must buy this part");
                            System.out.println();
                        }

                    }
                    else if(section==2){
                        if(s.motherboard[0]!=null){
                            s.motherboard[0].information();
                            System.out.println();
                        }
                        else if(s.motherboard[0]==null) {
                            System.out.println("You must buy this part");
                            System.out.println();
                        }
                    }
                    else if(section==3){
                        if(s.cpu[0]!=null) {
                            s.cpu[0].information();
                            System.out.println();
                        }
                        else if(s.cpu[0]==null) {
                            System.out.println("You must buy this part");
                            System.out.println();
                        }
                    }
                    else if(section==4){
                        if(s.ram[0]!=null) {
                            s.ram[0].information();
                            System.out.println();
                        }
                        else if(s.ram[0]==null) {
                            System.out.println("You must buy this part");
                            System.out.println();
                        }
                    }
                    else if(section==5){
                        if(s.hard_drive[0]!=null) {
                            s.hard_drive[0].information();
                            System.out.println();
                        }
                        else if(s.hard_drive[0]==null){
                            System.out.println("You must buy this part");
                            System.out.println();
                        }
                    }
                    else if(section==6){
                        if(s.graphic_card[0]!=null) {
                            s.graphic_card[0].information();
                            System.out.println();
                        }
                        else if(s.graphic_card[0]==null) {
                            System.out.println("You must buy this part");
                            System.out.println();
                        }
                    }
                    else if(section==7){
                        if(s.disk_drive[0]!=null) {
                            s.disk_drive[0].information();
                            System.out.println();
                        }
                        else if(s.disk_drive[0]==null) {
                            System.out.println("You must buy this part");
                            System.out.println();
                        }

                    }
                    else if(section==8){
                        if(s.monitor[0]!=null) {
                            s.monitor[0].information();
                            System.out.println();
                        }
                        else if(s.monitor[0]==null) {
                            System.out.println("You must buy this part");
                            System.out.println();
                        }
                    }
                    else if(section==9){
                        if(s.power[0]!=null) {
                            s.power[0].information();
                            System.out.println();
                        }
                        else if(s.power[0]==null){
                            System.out.println("You must buy this part");
                            System.out.println();
                        }
                    }
                    else if(section==10){
                        break;
                    }
                    else{
                        System.out.println("Please select a valid section.");
                    }



                }
            }
            else if(choose==4){
                while (true) {
                    System.out.println("**********************************************************");
                    System.out.println();
                    System.out.println("Welcome to Factory !");
                    System.out.println();
                    System.out.println("1-build your computer");
                    System.out.println("2-hold a computer introduction event");
                    System.out.println("3-exit");
                    System.out.println();
                    int section;
                    System.out.print("Select a section : ");
                    section=scan.nextInt();
                    System.out.println();
                    if(section==1){
                        System.out.println("**********************************************************");
                        System.out.println();
                        System.out.println("Welcome to build section !");
                        System.out.println();
                        if(s.monitor[0]!=null&&s.cpu[0]!=null&&s.disk_drive[0]!=null&&s.hard_drive[0]!=null
                        &&s.motherboard[0]!=null&&s.computer_case[0]!=null&s.graphic_card[0]!=null&&s.ram[0]!=null&&
                        s.power[0]!=null){
                            String p_name;
                            int choose2;
                            System.out.println("Now you can build your computer!");
                            System.out.println();
                            System.out.print("Enter a name for your computer : ");
                            p_name = scan.next();
                            System.out.println();

                            System.out.print("Are you sure to build this? 1 for yes or 2 for no : ");
                            choose2=scan.nextInt();
                            System.out.println();

                            switch (choose2){
                                case 1:{

                                    double price = s.computer_case[0].price+s.cpu[0].price+s.motherboard[0].price+s.ram[0].price+s.graphic_card[0].price+s.hard_drive[0].price+s.disk_drive[0].price+s.monitor[0].price+s.power[0].price;
                                    double percent;
                                    System.out.print("Enter a value for product price percent :");
                                    percent=scan.nextDouble();
                                    System.out.println();
                                    System.out.println("Your computer Price is : "+price+" $");
                                    System.out.println("the Price of "+p_name+" Computer with Profit is equal to "+(price+((price*percent)/100))+"$");
                                    System.out.println("And your profit from the sale of each computer is equal to "+((price*percent)/100)+"$");
                                    System.out.println("Congratulation ! Your computer is build. now you should hold a computer introduction event to sell your computer.");
                                    System.out.println();
                                    Product_History p = new Product_History(p_name,s.computer_case[0],s.cpu[0],s.motherboard[0],s.ram[0],s.graphic_card[0],s.hard_drive[0],s.disk_drive[0],s.monitor[0],s.power[0],price);
                                    p.getInformation();
                                    d.ph[i_number]=p;
                                    d.ph[i_number].price2=price+((price*percent)/100);
                                    d.st[i_number]=s;
                                    i_number++;
                                    break;
                                }
                                case 2:{
                                    break;
                                }
                                default:{
                                    System.out.println("Please select a valid section.");
                                    System.out.println();
                                }
                            }

                        }
                        else {
                            System.out.println("You should buy this parts to build your computer : ");
                            System.out.println();
                            s.InventoryCheck();
                        }
                    }
                    else if(section==2){
                        System.out.println("**********************************************************");
                        System.out.println();
                        System.out.println("Welcome to  Introduction Event section !");
                        System.out.println();
                        System.out.println("the "+d.ph[i_number-1].name+" computer was able to rank well in the world computer sale chart");
                        System.out.println(" This new product from apple company will be available for "+d.ph[i_number-1].price2+" $");
                        System.out.println("The final profit of this product for "+c.name+" will be equal to "+(float)(d.ph[i_number-1].price2-d.ph[i_number-1].price)*c.customers+"$");
                        c.money+=(float)d.ph[i_number-1].price+(d.ph[i_number-1].price2-d.ph[i_number-1].price)*c.customers;
                        c.customers+=10;

                        break;
                        }
                    else if(section==3){
                        break;
                    }
                    else {
                        System.out.println("Please select a valid section.");
                    }
                }
            }
            else if(choose==5) {
                while (true) {
                    int section;
                    System.out.println("**********************************************************");
                    System.out.println();
                    System.out.println("Welcome to Hardware sell section !");
                    System.out.println();
                    System.out.println("1-Computer Case");
                    System.out.println("2-Mother Board");
                    System.out.println("3-CPU");
                    System.out.println("4-RAM");
                    System.out.println("5-Hard Drive");
                    System.out.println("6-Graphic Card");
                    System.out.println("7-Disk Drive");
                    System.out.println("8-Monitor");
                    System.out.println("9-Power");
                    System.out.println("10-Exit");
                    System.out.println();
                    System.out.print("Select a section : ");
                    section = scan.nextInt();
                    System.out.println();
                    if(section==1) {
                        if (s.computer_case[0] != null) {
                            int section2;
                            s.computer_case[0].information();
                            System.out.print("Are you Sure to sell that ? 1 for yes or 2 for no : ");
                            section2 = scan.nextInt();
                            System.out.println();
                            if (section2 == 1) {
                                c.money += s.computer_case[0].price;
                                s.computer_case[0] = null;
                                System.out.println("the money was transferred to your company account");
                                System.out.println();
                            } else {
                                break;
                            }
                        }
                        else{
                            System.out.println("You must buy this part");
                            System.out.println();
                        }

                    }
                    else if(section==2) {
                        if (s.motherboard[0] != null) {
                            int section2;
                            s.motherboard[0].information();
                            System.out.print("Are you Sure to sell that ? 1 for yes or 2 for no : ");
                            section2 = scan.nextInt();
                            System.out.println();
                            if (section2 == 1) {
                                c.money += s.motherboard[0].price;
                                s.motherboard[0] = null;
                                System.out.println("the money was transferred to your company account");
                                System.out.println();
                            } else {
                                break;
                            }
                        }
                        else{
                            System.out.println("You must buy this part");
                            System.out.println();
                        }

                    }
                    else if(section==3) {
                        if (s.cpu[0] != null) {
                            int section2;
                            s.cpu[0].information();
                            System.out.print("Are you Sure to sell that ? 1 for yes or 2 for no : ");
                            section2 = scan.nextInt();
                            System.out.println();
                            if (section2 == 1) {
                                c.money += s.cpu[0].price;
                                s.cpu[0] = null;
                                System.out.println("the money was transferred to your company account");
                                System.out.println();
                            } else {
                                break;
                            }
                        }
                        else{
                            System.out.println("You must buy this part");
                            System.out.println();
                        }

                    }
                    else if(section==4) {
                        if (s.ram[0] != null) {
                            int section2;
                            s.ram[0].information();
                            System.out.print("Are you Sure to sell that ? 1 for yes or 2 for no : ");
                            section2 = scan.nextInt();
                            System.out.println();
                            if (section2 == 1) {
                                c.money += s.ram[0].price;
                                s.ram[0] = null;
                                System.out.println("the money was transferred to your company account");
                                System.out.println();
                            } else {
                                break;
                            }
                        }
                        else{
                            System.out.println("You must buy this part");
                            System.out.println();
                        }

                    }
                    else if(section==5) {
                        if (s.hard_drive[0] != null) {
                            int section2;
                            s.hard_drive[0].information();
                            System.out.print("Are you Sure to sell that ? 1 for yes or 2 for no : ");
                            section2 = scan.nextInt();
                            System.out.println();
                            if (section2 == 1) {
                                c.money += s.hard_drive[0].price;
                                s.hard_drive[0] = null;
                                System.out.println("the money was transferred to your company account");
                                System.out.println();
                            } else {
                                break;
                            }
                        }
                        else{
                            System.out.println("You must buy this part");
                            System.out.println();
                        }

                    }
                    else if(section==6) {
                        if (s.graphic_card[0] != null) {
                            int section2;
                            s.graphic_card[0].information();
                            System.out.print("Are you Sure to sell that ? 1 for yes or 2 for no : ");
                            section2 = scan.nextInt();
                            System.out.println();
                            if (section2 == 1) {
                                c.money += s.graphic_card[0].price;
                                s.graphic_card[0] = null;
                                System.out.println("the money was transferred to your company account");
                                System.out.println();
                            } else {
                                break;
                            }
                        }
                        else{
                            System.out.println("You must buy this part");
                            System.out.println();
                        }

                    }
                    else if(section==7) {
                        if (s.disk_drive[0] != null) {
                            int section2;
                            s.disk_drive[0].information();
                            System.out.print("Are you Sure to sell that ? 1 for yes or 2 for no : ");
                            section2 = scan.nextInt();
                            System.out.println();
                            if (section2 == 1) {
                                c.money += s.disk_drive[0].price;
                                s.disk_drive[0] = null;
                                System.out.println("the money was transferred to your company account");
                                System.out.println();
                            } else {
                                break;
                            }
                        }
                        else{
                            System.out.println("You must buy this part");
                            System.out.println();
                        }

                    }
                    else if(section==8) {
                        if (s.monitor[0] != null) {
                            int section2;
                            s.monitor[0].information();
                            System.out.print("Are you Sure to sell that ? 1 for yes or 2 for no : ");
                            section2 = scan.nextInt();
                            System.out.println();
                            if (section2 == 1) {
                                c.money += s.monitor[0].price;
                                s.monitor[0] = null;
                                System.out.println("the money was transferred to your company account");
                                System.out.println();
                            } else {
                                break;
                            }
                        }
                        else{
                            System.out.println("You must buy this part");
                            System.out.println();
                        }

                    }
                    else if(section==9) {
                        if (s.power[0] != null) {
                            int section2;
                            s.power[0].information();
                            System.out.print("Are you Sure to sell that ? 1 for yes or 2 for no : ");
                            section2 = scan.nextInt();
                            System.out.println();
                            if (section2 == 1) {
                                c.money += s.power[0].price;
                                s.power[0] = null;
                                System.out.println("the money was transferred to your company account");
                                System.out.println();
                            } else {
                                break;
                            }
                        }
                        else{
                            System.out.println("You must buy this part");
                            System.out.println();
                        }

                    }
                    else if(section==10){
                        break;
                    }
                    else{
                        System.out.println("Please select a valid section.");
                        System.out.println();
                    }



                }
            }
            else if(choose==8){
                break;
            }
            else{
                System.out.println();
                System.out.println("Please enter a valid section.");
            }
            System.out.println();
            System.out.println("**********************************************************");
        }
        System.out.println("**********************************************************");
    }
}
class Company{

    public String name =null;//name of company
    double money = 500;//budget of company
    static int year = 1970;//year of the game's start
    int customers=10;//customers of company

    /*statistics of company */

    public void statistics(){
        System.out.println("**********************************************************");
        System.out.println();
        System.out.println("Statistics of " + this.name + " computer's company :");
        System.out.println();
        System.out.println("Year : " + year);
        System.out.println();
        System.out.println("Your Company Budget : " + this.money +"$");
        System.out.println();
        System.out.println("Your Company Customers : " + this.customers);

    }

}
class Product_History{
    String name;
    double price;
    double price2;
    public Case[] computer_case = new Case[1];
    public Cpu[] cpu = new Cpu[1];
    public MotherBoard[] motherboard = new MotherBoard[1];
    public Ram[] ram = new Ram[1];
    public Graphic_Card[] graphic_card = new Graphic_Card[1];
    public Hard_Drive[] hard_drive = new Hard_Drive[1];
    public Disk_Drive[] disk_drive = new Disk_Drive[1];
    public Monitor[] monitor = new Monitor[1];
    public Power[] power = new Power[1];

    public Product_History(String name,Case computer_case,Cpu cpu,MotherBoard motherBoard,Ram ram,Graphic_Card graphic_card,Hard_Drive hard_drive,Disk_Drive disk_drive,Monitor monitor,Power power,double price){
        this.name=name;
        this.computer_case[0]=computer_case;
        this.cpu[0]=cpu;
        this.motherboard[0]=motherBoard;
        this.ram[0]=ram;
        this.graphic_card[0]=graphic_card;
        this.hard_drive[0]=hard_drive;
        this.disk_drive[0]=disk_drive;
        this.monitor[0]=monitor;
        this.power[0]=power;
        this.price=price;
    }

    public void getInformation(){
        System.out.println("Information of Computer : ");
        System.out.println();
        System.out.println("Product Name : "+this.name);
        System.out.println("Product Case : "+this.computer_case[0].name);
        System.out.println("Product MotherBoard : "+this.motherboard[0].name);
        System.out.println("Product CPU : "+this.cpu[0].name);
        System.out.println("Product Ram : "+this.ram[0].name);
        System.out.println("Product Hard Drive : "+this.hard_drive[0].name);
        System.out.println("Product Graphic Card : "+this.graphic_card[0].name);
        System.out.println("Product Disk Drive : "+this.disk_drive[0].name);
        System.out.println("Product Monitor : "+this.monitor[0].name);
        System.out.println("Product Power : "+this.power[0].name);
        System.out.println();
    }
}
class Storage{
    public Case[] computer_case = new Case[1];
    public Cpu[] cpu = new Cpu[1];
    public MotherBoard[] motherboard = new MotherBoard[1];
    public Ram[] ram = new Ram[1];
    public Graphic_Card[] graphic_card = new Graphic_Card[1];
    public Hard_Drive[] hard_drive = new Hard_Drive[1];
    public Disk_Drive[] disk_drive = new Disk_Drive[1];
    public Monitor[] monitor = new Monitor[1];
    public Power[] power = new Power[1];
    public void InventoryCheck(){
        if(this.computer_case[0]==null){
            System.out.println("you need to buy a case for your computer.");
            System.out.println();
        }
        if(this.cpu[0]==null){
            System.out.println("you need to buy a cpu for your computer.");
            System.out.println();
        }
        if(this.motherboard[0]==null){
            System.out.println("you need to buy a motherboard for your computer.");
            System.out.println();
        }
        if(this.ram[0]==null){
            System.out.println("you need to buy a ram for your computer.");
            System.out.println();
        }
        if(this.graphic_card[0]==null){
            System.out.println("you need to buy a graphic card for your computer.");
            System.out.println();
        }
        if(this.hard_drive[0]==null){
            System.out.println("you need to buy a hard drive for your computer.");
            System.out.println();
        }
        if(this.disk_drive[0]==null){
            System.out.println("you need to buy a disk drive for your computer.");
            System.out.println();
        }
        if(this.monitor[0]==null){
            System.out.println("you need to buy a monitor for your computer.");
            System.out.println();
        }
        if(this.power[0]==null){
            System.out.println("you need to buy a power for your computer.");
            System.out.println();
        }
    }
}
class Products{
    String name;
    String company;
    double price;
    Products(String name,String company,double price){
        this.name = name;
        this.company=company;
        this.price=price;
    }
}
class Case extends Products{
    String material;
    Case(String name,String company,double price,String material){
        super(name,company,price);
        this.material=material;
    }
    public void information(){

        System.out.println("**********************************************************");
        System.out.println();
        System.out.println("Information of Products :");
        System.out.println();
        System.out.println("Product Name : "+this.name);
        System.out.println("Product Company : "+this.company);
        System.out.println("Product Model : "+this.material);
        System.out.println("Product Price : "+this.price);
        System.out.println();
    }
}
class Cpu extends Products{
    int core;
    double frequency;
    Cpu(String name,String company,int core,double price,double frequency){
        super(name,company,price);
        this.core = core;
        this.frequency = frequency;
    }
    public void information(){
        System.out.println("**********************************************************");
        System.out.println();
        System.out.println("Information of Products :");
        System.out.println();
        System.out.println("Product Name : "+this.name);
        System.out.println("Product Company : "+this.company);
        System.out.println("Product core : "+this.core);
        System.out.println("Product frequency : "+this.frequency);
        System.out.println("Product Price : "+this.price+"$");
        System.out.println();

    }
}
class MotherBoard extends Products{
    String model;
    MotherBoard(String name,String company,double price,String model){
        super(name,company,price);
        this.model=model;

    }
    public void information(){
        System.out.println("**********************************************************");
        System.out.println();
        System.out.println("Information of Products :");
        System.out.println();
        System.out.println("Product Name : "+this.name);
        System.out.println("Product Company : "+this.company);
        System.out.println("Product Model : "+this.model);
        System.out.println("Product Price : "+this.price+"$");
        System.out.println();
    }
}
class Ram extends Products{
    String memory_model;//ddr3
    int capacity;//4g
    String model;// ex: cl11
    Ram(String name,String company,double price,String memory_model,int capacity,String model){
        super(name,company,price);
        this.memory_model=memory_model;
        this.capacity = capacity;
        this.model=model;
    }
    public void information(){
        System.out.println("**********************************************************");
        System.out.println();
        System.out.println("Information of Products :");
        System.out.println();
        System.out.println("Product Name : "+this.name);
        System.out.println("Product Company : "+this.company);
        System.out.println("Product Memory Model : "+this.memory_model);
        System.out.println("Product Model : "+this.model);
        System.out.println("Product Capacity : "+this.capacity);
        System.out.println("Product Price : "+this.price+"$");
        System.out.println();
    }
}
class Graphic_Card extends Products{
    String memory_type;
    int capacity;
    Graphic_Card(String name,String company,double price,String memory_type,int capacity){
        super(name,company,price);
        this.memory_type = memory_type;
        this.capacity = capacity;
    }
    public void information(){
        System.out.println("**********************************************************");
        System.out.println();
        System.out.println("Information of Products :");
        System.out.println();
        System.out.println("Product Name : "+this.name);
        System.out.println("Product Company : "+this.company);
        System.out.println("Product Memory Type : "+this.memory_type);
        System.out.println("Product Capacity : "+this.capacity);
        System.out.println("Product Price : "+this.price+"$");
        System.out.println();
    }
}
class Hard_Drive extends Products{
    String type;
    String model;
    int capacity;
    Hard_Drive(String name,String company,double price,String type,String model,int capacity){
        super(name,company,price);
        this.type=type;
        this.model=model;
        this.capacity=capacity;
    }
    public void information(){
        System.out.println("**********************************************************");
        System.out.println();
        System.out.println("Information of Products :");
        System.out.println();
        System.out.println("Product Name : "+this.name);
        System.out.println("Product Company : "+this.company);
        System.out.println("Product Type : "+this.type);
        System.out.println("Product Model : "+this.model);
        System.out.println("Product Capacity : "+this.capacity);
        System.out.println("Product Price : "+this.price+"$");
        System.out.println();
    }
}
class Disk_Drive extends Products{
    String type;
    String model;
    Disk_Drive(String name,String company,double price,String type,String model){
        super(name,company,price);
        this.type=type;
        this.model=model;
    }
    public void information(){
        System.out.println("**********************************************************");
        System.out.println();
        System.out.println("Information of Products :");
        System.out.println();
        System.out.println("Product Name : "+this.name);
        System.out.println("Product Company : "+this.company);
        System.out.println("Product Type : "+this.type);
        System.out.println("Product Model : "+this.model);
        System.out.println("Product Price : "+this.price+"$");
        System.out.println();
    }
}
class Monitor extends Products{
    String type;
    String model;
    double size;
    Monitor(String name,String company,double price,String type,String model,double size){
        super(name,company,price);
        this.type=type;
        this.model=model;
        this.size=size;
    }
    public void information(){
        System.out.println("**********************************************************");
        System.out.println();
        System.out.println("Information of Products :");
        System.out.println();
        System.out.println("Product Name : "+this.name);
        System.out.println("Product Company : "+this.company);
        System.out.println("Product Type : "+this.type);
        System.out.println("Product Model : "+this.model);
        System.out.println("Product Size : "+this.size+" inch");
        System.out.println("Product Price : "+this.price+"$");
        System.out.println();
    }
}
class Power extends Products{
    String model;
    String type;
    int might;//power
    Power(String name,String company,double price,String model,String type,int might){
        super(name,company,price);
        this.model=model;
        this.type=type;
        this.might=might;
    }
    public void information(){
        System.out.println("**********************************************************");
        System.out.println();
        System.out.println("Information of Products :");
        System.out.println();
        System.out.println("Product Name : "+this.name);
        System.out.println("Product Company : "+this.company);
        System.out.println("Product Type : "+this.type);
        System.out.println("Product Model : "+this.model);
        System.out.println("Product Might : "+this.might+"w");
        System.out.println("Product Price : "+this.price+"$");
        System.out.println();
    }
}
class Data_Base{
    Storage[] st = new Storage [1000];
    Product_History [] ph = new Product_History[1000];
}


