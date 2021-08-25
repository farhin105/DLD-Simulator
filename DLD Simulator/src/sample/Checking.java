package sample;

/**
 * Created by DELL on 12/6/2015.
 */

public class Checking {
    private static Main m;
    final int BLANK=-9999999;
    public int[][] CheckerAndGate()
    {
        int ARRAY_FINAL[][]=new int[m.drawingLine.data.size()][4];
        for(int i=0;i<m.drawingLine.data.size();i++)
        {
            for(int j=0;j<4;j++)
            ARRAY_FINAL[i][j]=BLANK;
        }
        for(int i = 0 ; i < m.drawingLine.data.size() ; i++) {

                ARRAY_FINAL[i][3]=m.drawingLine.data.get(i).GateNo;
            for (int j=0;j<m.drawingLine.dataLine.size();j++)
            {
                if(m.drawingLine.data.get(i).GateNo==7404)//for not gate
                {
                    //ARRAY_FINAL[i][2]=BLANK;
                    if(m.drawingLine.dataLine.get(j).getx1()>=m.drawingLine.data.get(i).getx() && m.drawingLine.dataLine.get(j).getx1()<=m.drawingLine.data.get(i).getx()+14 && (m.drawingLine.dataLine.get(j).gety1()<=m.drawingLine.data.get(i).gety()+3||m.drawingLine.dataLine.get(j).gety1()>m.drawingLine.data.get(i).gety()-3 ))
                    {
                        ARRAY_FINAL[i][0]=j;
                    }
                    else if(m.drawingLine.dataLine.get(j).getx2()>=m.drawingLine.data.get(i).getx() && m.drawingLine.dataLine.get(j).getx2()<=m.drawingLine.data.get(i).getx()+14 && (m.drawingLine.dataLine.get(j).gety2()<=m.drawingLine.data.get(i).gety()+3||m.drawingLine.dataLine.get(j).gety2()>m.drawingLine.data.get(i).gety()-3 ))
                    {
                        ARRAY_FINAL[i][0]=j;
                    }
                    else if(m.drawingLine.dataLine.get(j).getx1()>=m.drawingLine.data.get(i).getx()+51 && m.drawingLine.dataLine.get(j).getx1()<=m.drawingLine.data.get(i).getx()+61 && (m.drawingLine.dataLine.get(j).gety1()<=m.drawingLine.data.get(i).gety()+3||m.drawingLine.dataLine.get(j).gety1()>m.drawingLine.data.get(i).gety()-3 ))
                    {
                        ARRAY_FINAL[i][1]=j;
                    }
                    else if(m.drawingLine.dataLine.get(j).getx2()>=m.drawingLine.data.get(i).getx()+51 && m.drawingLine.dataLine.get(j).getx2()<=m.drawingLine.data.get(i).getx()+61 && (m.drawingLine.dataLine.get(j).gety2()<=m.drawingLine.data.get(i).gety()+3||m.drawingLine.dataLine.get(j).gety2()>m.drawingLine.data.get(i).gety()-3 ))
                    {
                        ARRAY_FINAL[i][1]=j;
                    }

                }
                else if(m.drawingLine.data.get(i).GateNo==7402 )//for Nor Gate
                {
                    if(m.drawingLine.dataLine.get(j).getx1()>=m.drawingLine.data.get(i).getx() && m.drawingLine.dataLine.get(j).getx1()<=m.drawingLine.data.get(i).getx()+14 && (m.drawingLine.dataLine.get(j).gety1()<=m.drawingLine.data.get(i).gety()+3&&m.drawingLine.dataLine.get(j).gety1()>m.drawingLine.data.get(i).gety()-3 ))
                    {
                        ARRAY_FINAL[i][0]=j;
                    }//in1
                    if(m.drawingLine.dataLine.get(j).getx2()>=m.drawingLine.data.get(i).getx() && m.drawingLine.dataLine.get(j).getx2()<=m.drawingLine.data.get(i).getx()+14 && (m.drawingLine.dataLine.get(j).gety2()<=m.drawingLine.data.get(i).gety()+3&&m.drawingLine.dataLine.get(j).gety2()>m.drawingLine.data.get(i).gety()-3 ))
                    {
                        ARRAY_FINAL[i][0]=j;
                    }//in1
                    if(m.drawingLine.dataLine.get(j).getx1()>=m.drawingLine.data.get(i).getx() && m.drawingLine.dataLine.get(j).getx1()<=m.drawingLine.data.get(i).getx()+14 && (m.drawingLine.dataLine.get(j).gety1()<=m.drawingLine.data.get(i).gety()+15&&m.drawingLine.dataLine.get(j).gety1()>m.drawingLine.data.get(i).gety()+9 ))
                    {
                        ARRAY_FINAL[i][2]=j;
                    }//in2
                    if(m.drawingLine.dataLine.get(j).getx2()>=m.drawingLine.data.get(i).getx() && m.drawingLine.dataLine.get(j).getx2()<=m.drawingLine.data.get(i).getx()+14 && (m.drawingLine.dataLine.get(j).gety2()<=m.drawingLine.data.get(i).gety()+15&&m.drawingLine.dataLine.get(j).gety2()>m.drawingLine.data.get(i).gety()+9 ))
                    {
                        ARRAY_FINAL[i][2]=j;
                    }//in2
                    if(m.drawingLine.dataLine.get(j).getx1()>=m.drawingLine.data.get(i).getx()+56 && m.drawingLine.dataLine.get(j).getx1()<=m.drawingLine.data.get(i).getx()+67 && (m.drawingLine.dataLine.get(j).gety1()<=m.drawingLine.data.get(i).gety()+3+5&&m.drawingLine.dataLine.get(j).gety1()>m.drawingLine.data.get(i).gety()+2 ))
                    {
                        ARRAY_FINAL[i][1]=j;
                    }//out1
                    if(m.drawingLine.dataLine.get(j).getx2()>=m.drawingLine.data.get(i).getx()+56 && m.drawingLine.dataLine.get(j).getx2()<=m.drawingLine.data.get(i).getx()+67 && (m.drawingLine.dataLine.get(j).gety2()<=m.drawingLine.data.get(i).gety()+3+5&&m.drawingLine.dataLine.get(j).gety2()>m.drawingLine.data.get(i).gety()+2 ))
                    {
                        ARRAY_FINAL[i][1]=j;
                    }//out2

                }
                else if(m.drawingLine.data.get(i).GateNo==7486 || m.drawingLine.data.get(i).GateNo==7426)//for Xor Gate and Xnor Gate
                {
                    if(m.drawingLine.dataLine.get(j).getx1()>=m.drawingLine.data.get(i).getx() && m.drawingLine.dataLine.get(j).getx1()<=m.drawingLine.data.get(i).getx()+6 && (m.drawingLine.dataLine.get(j).gety1()<=m.drawingLine.data.get(i).gety()+3&&m.drawingLine.dataLine.get(j).gety1()>m.drawingLine.data.get(i).gety()-3 ))
                    {
                        ARRAY_FINAL[i][0]=j;
                    }//in1
                    if(m.drawingLine.dataLine.get(j).getx2()>=m.drawingLine.data.get(i).getx() && m.drawingLine.dataLine.get(j).getx2()<=m.drawingLine.data.get(i).getx()+6 && (m.drawingLine.dataLine.get(j).gety2()<=m.drawingLine.data.get(i).gety()+3&&m.drawingLine.dataLine.get(j).gety2()>m.drawingLine.data.get(i).gety()-3 ))
                    {
                        ARRAY_FINAL[i][0]=j;
                    }//in1
                    if(m.drawingLine.dataLine.get(j).getx1()>=m.drawingLine.data.get(i).getx() && m.drawingLine.dataLine.get(j).getx1()<=m.drawingLine.data.get(i).getx()+6 && (m.drawingLine.dataLine.get(j).gety1()<=m.drawingLine.data.get(i).gety()+15&&m.drawingLine.dataLine.get(j).gety1()>m.drawingLine.data.get(i).gety()+9 ))
                    {
                        ARRAY_FINAL[i][2]=j;
                    }//in2
                    if(m.drawingLine.dataLine.get(j).getx2()>=m.drawingLine.data.get(i).getx() && m.drawingLine.dataLine.get(j).getx2()<=m.drawingLine.data.get(i).getx()+6 && (m.drawingLine.dataLine.get(j).gety2()<=m.drawingLine.data.get(i).gety()+15&&m.drawingLine.dataLine.get(j).gety2()>m.drawingLine.data.get(i).gety()+9 ))
                    {
                        ARRAY_FINAL[i][2]=j;
                    }//in2
                    /*if(m.drawingLine.dataLine.get(j).getx1()>=m.drawingLine.data.get(i).getx()+50 && m.drawingLine.dataLine.get(j).getx1()<=m.drawingLine.data.get(i).getx()+56 && (m.drawingLine.dataLine.get(j).gety1()<=m.drawingLine.data.get(i).gety()+3+5&&m.drawingLine.dataLine.get(j).gety1()>m.drawingLine.data.get(i).gety()+2 ))
                    {
                        ARRAY_FINAL[i][1]=j;
                    }//out1
                    if(m.drawingLine.dataLine.get(j).getx2()>=m.drawingLine.data.get(i).getx()+50 && m.drawingLine.dataLine.get(j).getx2()<=m.drawingLine.data.get(i).getx()+56 && (m.drawingLine.dataLine.get(j).gety2()<=m.drawingLine.data.get(i).gety()+3+5&&m.drawingLine.dataLine.get(j).gety2()>m.drawingLine.data.get(i).gety()+2 ))
                    {
                        ARRAY_FINAL[i][1]=j;
                    }//out2*/
                    if(m.drawingLine.dataLine.get(j).getx1()>=m.drawingLine.data.get(i).getx()+50 && m.drawingLine.dataLine.get(j).getx1()<=m.drawingLine.data.get(i).getx()+62 && (m.drawingLine.dataLine.get(j).gety1()<=m.drawingLine.data.get(i).gety()+3+5&&m.drawingLine.dataLine.get(j).gety1()>m.drawingLine.data.get(i).gety()+2 ))
                    {
                        ARRAY_FINAL[i][1]=j;
                    }//out1
                    if(m.drawingLine.dataLine.get(j).getx2()>=m.drawingLine.data.get(i).getx()+50 && m.drawingLine.dataLine.get(j).getx2()<=m.drawingLine.data.get(i).getx()+62 && (m.drawingLine.dataLine.get(j).gety2()<=m.drawingLine.data.get(i).gety()+3+5&&m.drawingLine.dataLine.get(j).gety2()>m.drawingLine.data.get(i).gety()+2 ))
                    {
                        ARRAY_FINAL[i][1]=j;
                    }//out2

                }
                else//for others gate
                {
                    if(m.drawingLine.dataLine.get(j).getx1()>=m.drawingLine.data.get(i).getx() && m.drawingLine.dataLine.get(j).getx1()<=m.drawingLine.data.get(i).getx()+10 && (m.drawingLine.dataLine.get(j).gety1()<=m.drawingLine.data.get(i).gety()+3&&m.drawingLine.dataLine.get(j).gety1()>m.drawingLine.data.get(i).gety()-3 ))
                    {
                        ARRAY_FINAL[i][0]=j;
                    }//in1
                    if(m.drawingLine.dataLine.get(j).getx2()>=m.drawingLine.data.get(i).getx() && m.drawingLine.dataLine.get(j).getx2()<=m.drawingLine.data.get(i).getx()+10 && (m.drawingLine.dataLine.get(j).gety2()<=m.drawingLine.data.get(i).gety()+3&&m.drawingLine.dataLine.get(j).gety2()>m.drawingLine.data.get(i).gety()-3 ))
                    {
                        ARRAY_FINAL[i][0]=j;
                    }//in1
                    if(m.drawingLine.dataLine.get(j).getx1()>=m.drawingLine.data.get(i).getx() && m.drawingLine.dataLine.get(j).getx1()<=m.drawingLine.data.get(i).getx()+10 && (m.drawingLine.dataLine.get(j).gety1()<=m.drawingLine.data.get(i).gety()+13&&m.drawingLine.dataLine.get(j).gety1()>m.drawingLine.data.get(i).gety()+7 ))
                    {
                        ARRAY_FINAL[i][2]=j;
                    }//in2
                    if(m.drawingLine.dataLine.get(j).getx2()>=m.drawingLine.data.get(i).getx() && m.drawingLine.dataLine.get(j).getx2()<=m.drawingLine.data.get(i).getx()+10 && (m.drawingLine.dataLine.get(j).gety2()<=m.drawingLine.data.get(i).gety()+13&&m.drawingLine.dataLine.get(j).gety2()>m.drawingLine.data.get(i).gety()+7 ))
                    {
                        ARRAY_FINAL[i][2]=j;
                    }//in2
                    if(m.drawingLine.dataLine.get(j).getx1()>=m.drawingLine.data.get(i).getx()+45 && m.drawingLine.dataLine.get(j).getx1()<=m.drawingLine.data.get(i).getx()+64 && (m.drawingLine.dataLine.get(j).gety1()<=m.drawingLine.data.get(i).gety()+3+4&&m.drawingLine.dataLine.get(j).gety1()>m.drawingLine.data.get(i).gety()+1 ))
                    {
                        ARRAY_FINAL[i][1]=j;
                    }//out1
                    if(m.drawingLine.dataLine.get(j).getx2()>=m.drawingLine.data.get(i).getx()+45 && m.drawingLine.dataLine.get(j).getx2()<=m.drawingLine.data.get(i).getx()+64 && (m.drawingLine.dataLine.get(j).gety2()<=m.drawingLine.data.get(i).gety()+3+4&&m.drawingLine.dataLine.get(j).gety2()>m.drawingLine.data.get(i).gety()+1 ))
                    {
                        ARRAY_FINAL[i][1]=j;
                    }//out2

                }
            }
        }
        return ARRAY_FINAL;
    }
    public  void PrintArray(int A[][])
    {
        for(int i=0;i<m.drawingLine.data.size();i++)
        {
            for(int j=0;j<4;j++)
            {
                System.out.println("here goes checking: "+"i: " +i +"   j:"+ j +"  "+A[i][j]);
            }
        }
    }
    public int[] CheckerInput()
    {
        int InputArrayActiveTest[]=new int[6];
        for(int j=0;j<6;j++)
        {
            InputArrayActiveTest[j]=BLANK;
        }
        for (int i=0;i<m.drawingLine.dataLine.size();i++)
        {
            if(m.drawingLine.dataLine.get(i).getx1()>=83 && m.drawingLine.dataLine.get(i).getx1()<=88+10 && m.drawingLine.dataLine.get(i).gety1()>=134 && m.drawingLine.dataLine.get(i).gety1()<=139+8)
            {
                InputArrayActiveTest[0]=i;
                System.out.println("index: "+i);
                System.out.println("inputA");
                //System.out.println("here inputA: "+m.TextInputA.getText());
            }//i1co1
            if(m.drawingLine.dataLine.get(i).getx2()>=83 && m.drawingLine.dataLine.get(i).getx2()<=88+10 && m.drawingLine.dataLine.get(i).gety2()>=134 && m.drawingLine.dataLine.get(i).gety2()<=139+8)
            {
            InputArrayActiveTest[0]=i;
            System.out.println("index: "+i);
            System.out.println("inputA");
            //System.out.println("here inputA: "+m.TextInputA.getText());
            }//i1co2

            if(m.drawingLine.dataLine.get(i).getx2()>=83 && m.drawingLine.dataLine.get(i).getx2()<=88+10 && m.drawingLine.dataLine.get(i).gety2()>=185 && m.drawingLine.dataLine.get(i).gety2()<=190+8)
            {
                //InputArrayActiveTest[1]=1;
                InputArrayActiveTest[1]=i;
                System.out.println("index: "+i);
                System.out.println("inputB");
            }//i2co1
            if(m.drawingLine.dataLine.get(i).getx1()>=83 && m.drawingLine.dataLine.get(i).getx1()<=88+10 && m.drawingLine.dataLine.get(i).gety1()>=185 && m.drawingLine.dataLine.get(i).gety1()<=190+8)
            {
                //InputArrayActiveTest[1]=1;
                InputArrayActiveTest[1]=i;
                System.out.println("index: "+i);
                System.out.println("inputB");
            }//i2co2
            if(m.drawingLine.dataLine.get(i).getx1()>=83 && m.drawingLine.dataLine.get(i).getx1()<=88+10 && m.drawingLine.dataLine.get(i).gety1()>=242 && m.drawingLine.dataLine.get(i).gety1()<=247+8)
            {
                InputArrayActiveTest[2]=i;
                System.out.println("index: "+i);
                System.out.println("inputC");
            }//i3co1
            if(m.drawingLine.dataLine.get(i).getx2()>=83 && m.drawingLine.dataLine.get(i).getx2()<=88+10 && m.drawingLine.dataLine.get(i).gety2()>=242 && m.drawingLine.dataLine.get(i).gety2()<=247+8)
            {
                InputArrayActiveTest[2]=i;
                System.out.println("index: "+i);
                System.out.println("inputC");
            }//i3co2
            if(m.drawingLine.dataLine.get(i).getx1()>=83 && m.drawingLine.dataLine.get(i).getx1()<=88+10 && m.drawingLine.dataLine.get(i).gety1()>=303 && m.drawingLine.dataLine.get(i).gety1()<=308+8)
            {
                InputArrayActiveTest[3]=i;
                System.out.println("index: "+i);
                System.out.println("inputD");
            }//i4co1
            if(m.drawingLine.dataLine.get(i).getx2()>=83 && m.drawingLine.dataLine.get(i).getx2()<=88+10 && m.drawingLine.dataLine.get(i).gety2()>=303 && m.drawingLine.dataLine.get(i).gety2()<=308+8)
            {
                InputArrayActiveTest[3]=i;
                System.out.println("index: "+i);
                System.out.println("inputD");
            }//i4co2
            if(m.drawingLine.dataLine.get(i).getx1()>=83 && m.drawingLine.dataLine.get(i).getx1()<=88+10 && m.drawingLine.dataLine.get(i).gety1()>=374 && m.drawingLine.dataLine.get(i).gety1()<=379+8)
            {
                InputArrayActiveTest[4]=i;
                System.out.println("index: "+i);
                System.out.println("inputE");
            }//i5co1
            if(m.drawingLine.dataLine.get(i).getx2()>=83 && m.drawingLine.dataLine.get(i).getx2()<=88+10 && m.drawingLine.dataLine.get(i).gety2()>=374 && m.drawingLine.dataLine.get(i).gety2()<=379+8)
            {
                InputArrayActiveTest[4]=i;
                System.out.println("index: "+i);
                System.out.println("inputE");
            }//i5co2
            if(m.drawingLine.dataLine.get(i).getx1()>=83 && m.drawingLine.dataLine.get(i).getx1()<=88+10 && m.drawingLine.dataLine.get(i).gety1()>=436 && m.drawingLine.dataLine.get(i).gety1()<=441+8)
            {
                InputArrayActiveTest[5]=i;
                System.out.println("index: "+i);
                System.out.println("inputF");
            }
            if(m.drawingLine.dataLine.get(i).getx2()>=83 && m.drawingLine.dataLine.get(i).getx2()<=88+10 && m.drawingLine.dataLine.get(i).gety2()>=436 && m.drawingLine.dataLine.get(i).gety2()<=441+8)
            {
                InputArrayActiveTest[5]=i;
                System.out.println("index: "+i);
                System.out.println("inputF");
            }
        }
        return InputArrayActiveTest;
    }
    public int[] CheckerOutput()
    {
        int OutputArrayActive[]=new int[4];
        for(int j=0;j<4;j++)
        {
            OutputArrayActive[j]=BLANK;
        }
       for(int i=0;i<m.drawingLine.dataLine.size();i++)
       {
           if(m.drawingLine.dataLine.get(i).getx1()>=695 && m.drawingLine.dataLine.get(i).getx1()<=705+18 && m.drawingLine.dataLine.get(i).gety1()>=160 && m.drawingLine.dataLine.get(i).gety1()<=168+11)//output
           {
               OutputArrayActive[0]=i;
               System.out.println("index: "+i);
               System.out.println("Output1");
           }
           if(m.drawingLine.dataLine.get(i).getx2()>=695 && m.drawingLine.dataLine.get(i).getx2()<=705+18 && m.drawingLine.dataLine.get(i).gety2()>=160 && m.drawingLine.dataLine.get(i).gety2()<=168+11)//output
           {
               OutputArrayActive[0]=i;
               System.out.println("index: "+i);
               System.out.println("Output1");
           }
           if(m.drawingLine.dataLine.get(i).getx1()>=695 && m.drawingLine.dataLine.get(i).getx1()<=705+18 && m.drawingLine.dataLine.get(i).gety1()>=220 && m.drawingLine.dataLine.get(i).gety1()<=233+11)
           {
               OutputArrayActive[1]=i;
               System.out.println("index: "+i);
               System.out.println("Output2");
           }
           if(m.drawingLine.dataLine.get(i).getx2()>=695 && m.drawingLine.dataLine.get(i).getx2()<=705+18 && m.drawingLine.dataLine.get(i).gety2()>=220 && m.drawingLine.dataLine.get(i).gety2()<=233+11)
           {
               OutputArrayActive[1]=i;
               System.out.println("index: "+i);
               System.out.println("Output2");
           }
           if(m.drawingLine.dataLine.get(i).getx1()>=695 && m.drawingLine.dataLine.get(i).getx1()<=705+18 && m.drawingLine.dataLine.get(i).gety1()>=297 && m.drawingLine.dataLine.get(i).gety1()<=307+11)
           {
               OutputArrayActive[2]=i;
               System.out.println("index: "+i);
               System.out.println("Output3");
           }
           if(m.drawingLine.dataLine.get(i).getx2()>=695 && m.drawingLine.dataLine.get(i).getx2()<=705+18 && m.drawingLine.dataLine.get(i).gety2()>=297 && m.drawingLine.dataLine.get(i).gety2()<=307+11)
           {
               OutputArrayActive[2]=i;
               System.out.println("index: "+i);
               System.out.println("Output3");
           }
           if(m.drawingLine.dataLine.get(i).getx1()>=695 && m.drawingLine.dataLine.get(i).getx1()<=705+18 && m.drawingLine.dataLine.get(i).gety1()>=376 && m.drawingLine.dataLine.get(i).gety1()<=384+11)
           {
               OutputArrayActive[3]=i;
               System.out.println("index: "+i);
               System.out.println("Output4");
           }
           if(m.drawingLine.dataLine.get(i).getx2()>=695 && m.drawingLine.dataLine.get(i).getx2()<=705+18 && m.drawingLine.dataLine.get(i).gety2()>=376 && m.drawingLine.dataLine.get(i).gety2()<=384+11)
           {
               OutputArrayActive[3]=i;
               System.out.println("index: "+i);
               System.out.println("Output4");
           }
       }
        return OutputArrayActive;
    }
    public void  shortCheckingUpdatedA_Array(int A_Array[][],int In_Array[])
    {
        for(int i=0;i<m.drawingLine.dataLine.size();i++)
        {
            for(int j=0;j<m.drawingLine.dataLine.size();j++)
            {
                if(m.drawingLine.dataLine.get(i).getx1()>m.drawingLine.dataLine.get(i).getx2())
                {
                    if(m.drawingLine.dataLine.get(j).getx1()>m.drawingLine.dataLine.get(i).getx2()&&m.drawingLine.dataLine.get(j).getx1()<m.drawingLine.dataLine.get(i).getx1() && m.drawingLine.dataLine.get(j).gety1()<m.drawingLine.dataLine.get(i).getMidy()+3&&m.drawingLine.dataLine.get(j).gety1()>m.drawingLine.dataLine.get(i).getMidy()-3)
                    {
                        m.drawingLine.UpdateSameIndex(i,j,BLANK);
                    }//1
                    if(m.drawingLine.dataLine.get(j).getx2()>m.drawingLine.dataLine.get(i).getx2()&&m.drawingLine.dataLine.get(j).getx2() < m.drawingLine.dataLine.get(i).getx1() && m.drawingLine.dataLine.get(j).gety2()<m.drawingLine.dataLine.get(i).getMidy()+3&&m.drawingLine.dataLine.get(j).gety2()>m.drawingLine.dataLine.get(i).getMidy()-3)
                    {
                        m.drawingLine.UpdateSameIndex(i,j,BLANK);
                    }//2
                }
                if(m.drawingLine.dataLine.get(i).getx2()>m.drawingLine.dataLine.get(i).getx1())
                {
                    if(m.drawingLine.dataLine.get(j).getx1()<m.drawingLine.dataLine.get(i).getx2()&&m.drawingLine.dataLine.get(j).getx1()>m.drawingLine.dataLine.get(i).getx1() && m.drawingLine.dataLine.get(j).gety1()<m.drawingLine.dataLine.get(i).getMidy()+3&&m.drawingLine.dataLine.get(j).gety1()>m.drawingLine.dataLine.get(i).getMidy()-3)
                    {
                        m.drawingLine.UpdateSameIndex(i,j,BLANK);
                    }//3
                    if(m.drawingLine.dataLine.get(j).getx2()<m.drawingLine.dataLine.get(i).getx2()&&m.drawingLine.dataLine.get(j).getx2() > m.drawingLine.dataLine.get(i).getx1() && m.drawingLine.dataLine.get(j).gety2()<m.drawingLine.dataLine.get(i).getMidy()+3&&m.drawingLine.dataLine.get(j).gety2()>m.drawingLine.dataLine.get(i).getMidy()-3)
                    {
                        m.drawingLine.UpdateSameIndex(i,j,BLANK);
                    }//4
                }
                if(m.drawingLine.dataLine.get(i).gety1()>m.drawingLine.dataLine.get(i).gety2())
                {
                    if(m.drawingLine.dataLine.get(j).gety1()>m.drawingLine.dataLine.get(i).gety2()&&m.drawingLine.dataLine.get(j).gety1()<m.drawingLine.dataLine.get(i).gety1() && m.drawingLine.dataLine.get(j).getx1()<m.drawingLine.dataLine.get(i).getMidx()+3&&m.drawingLine.dataLine.get(j).getx1()>m.drawingLine.dataLine.get(i).getMidx()-3)
                    {
                        m.drawingLine.UpdateSameIndex(i,j,BLANK);
                    }//5
                    if(m.drawingLine.dataLine.get(j).gety2()>m.drawingLine.dataLine.get(i).gety2()&&m.drawingLine.dataLine.get(j).gety2() < m.drawingLine.dataLine.get(i).gety1() && m.drawingLine.dataLine.get(j).getx2()<m.drawingLine.dataLine.get(i).getMidx()+3&&m.drawingLine.dataLine.get(j).getx2()>m.drawingLine.dataLine.get(i).getMidx()-3)
                    {
                        m.drawingLine.UpdateSameIndex(i,j,BLANK);
                    }//6
                }
                if(m.drawingLine.dataLine.get(i).gety1()<m.drawingLine.dataLine.get(i).gety2())
                {
                    if(m.drawingLine.dataLine.get(j).gety1()<m.drawingLine.dataLine.get(i).gety2()&&m.drawingLine.dataLine.get(j).gety1()>m.drawingLine.dataLine.get(i).gety1() && m.drawingLine.dataLine.get(j).getx1()<m.drawingLine.dataLine.get(i).getMidx()+3&&m.drawingLine.dataLine.get(j).getx1()>m.drawingLine.dataLine.get(i).getMidx()-3)
                    {
                        m.drawingLine.UpdateSameIndex(i,j,BLANK);
                    }//7
                    if(m.drawingLine.dataLine.get(j).gety2()<m.drawingLine.dataLine.get(i).gety2()&&m.drawingLine.dataLine.get(j).gety2() >m.drawingLine.dataLine.get(i).gety1() && m.drawingLine.dataLine.get(j).getx2()<m.drawingLine.dataLine.get(i).getMidx()+3&&m.drawingLine.dataLine.get(j).getx2()>m.drawingLine.dataLine.get(i).getMidx()-3)
                    {
                        m.drawingLine.UpdateSameIndex(i,j,BLANK);
                    }//8
                }
            }
        }
        for(int i=0;i<m.drawingLine.SameIndexData.size();i++)
        {
            for(int j=0;j<6;j++)
            {
                if(In_Array[j]!=BLANK && (In_Array[j]==m.drawingLine.SameIndexData.get(i).index1 || In_Array[j]==m.drawingLine.SameIndexData.get(i).index2))
                {
                    //m.drawingLine.UpdateSameIndex(m.drawingLine.SameIndexData.get(i).index1,m.drawingLine.SameIndexData.get(i).index2,In_Array[j]);
                    //problem to be found out
                    m.drawingLine.SameIndexData.get(i).finalIndex=In_Array[j];
                    System.out.println("problem: "+ In_Array[j] +"  j  : "+j+"  index1 "+m.drawingLine.SameIndexData.get(i).index1+"   index2 "+m.drawingLine.SameIndexData.get(i).index2);
                }
            }

        }
        for(int i=0;i<m.drawingLine.data.size();i++)
        {
            for(int j=0;j<3;j++)
            {
                for(int k=0;k<m.drawingLine.SameIndexData.size();k++)
                {
                    if(A_Array[i][j]==m.drawingLine.SameIndexData.get(k).index1 || A_Array[i][j]==m.drawingLine.SameIndexData.get(k).index2)
                    {
                        if(m.drawingLine.SameIndexData.get(k).finalIndex!=BLANK)
                            A_Array[i][j]=m.drawingLine.SameIndexData.get(k).finalIndex;
                        else
                            A_Array[i][j]=m.drawingLine.SameIndexData.get(k).index1;
                    }
                }
            }
        }
    }
    public void SetMain(Main m)
    {
        this.m=m;
    }

}
