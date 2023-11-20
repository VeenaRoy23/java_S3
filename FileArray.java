import java.io.*;

class FileArray{
    public static void main(String args[]) throws IOException{
        int i,reverse;
        String str="";
        String str2="";
        char c;
        FileInputStream fin=null;
        FileOutputStream fout=null;
        if(args.length!=2)
            System.out.println("Enter two files");
        else
            fin=new FileInputStream(args[0]);
            fout=new FileOutputStream(args[1]);
            while((i=fin.read())!=-1)
            {
                if(((char)i)!='\n')
                {
                    str=str+(char)i;
                }
                else{
                    int num=Integer.parseInt(str);
                    if(num%2!=0)
                    {
                        System.out.println(str);
                        while(num!=0)
                        {
                            int r=num%10;
                            str2=str2+Integer.toString(r);
                            num=num/10;
                            

                        }
                        fout.write(str2.getBytes());
                        fout.write("\n".getBytes());
                        num=0;
                str="";
                str2="";
                    }
                    
                
                    
                }
                

            }
            fin.close();
            fout.close();

    }
}
