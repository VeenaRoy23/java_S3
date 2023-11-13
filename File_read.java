import java.io.*;
class File_read{
    public static void main(String args[])throws IOException{
        if(args.length!=3)
        {
            System.out.println("Usage:copy files from to");
            return;
            
        }
        FileInputStream fi=null;
        FileOutputStream feven=null;
        FileOutputStream fodd=null;
        int i;
        String str="";
        try{
            fi=new FileInputStream(args[0]);
            feven=new FileOutputStream(args[1]);
            fodd=new FileOutputStream(args[2]);
            
            
            while((i=fi.read())!=-1)
            {
                if((char)i!='\n')
                    str=str+(char)i;
                else
                {
                    System.out.println(str);
                    int num=Integer.parseInt(str);
                    if(num%2==0)
                    {
                        feven.write(str.getBytes());
                        feven.write("\n".getBytes());
                    }
                    else
                    {
                        fodd.write(str.getBytes());
                        fodd.write("\n".getBytes());
                    }
                   str="";
                }

                
        }
        }
        catch(FileNotFoundException e){
            System.out.println(e);
        }
        catch(IOException e){
            System.out.println(e);
        }
        
        finally{
            try{
                if(fi!=null)
                    fi.close();
                if(feven!=null)
                    feven.close();
                if(fodd!=null)
                    fodd.close();
            }
            catch(IOException e1){
                System.out.println(e1);
            }
        }
       
            
        }
    }
