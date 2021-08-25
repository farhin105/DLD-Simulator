package sample;

import ServerPackage.CircuitLogicServer;
import util.NetworkUtil;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

/**
 * Created by DELL on 12/8/2015.
 */
public class CheckingForOutputAfterChecking {
    final int NOTHING=555555;
    public int Final_Array[][];
    //public int A_Array_Input[][];
    public static Main m;
    public static SimulatorController controller;
    public void FinalCheckingFirst(int A_Array[][],int In_Array[],int Out_Array[]) throws IOException, ClassNotFoundException {
        Final_Array=new int[m.drawingLine.data.size()][4];
        for(int i=0;i<m.drawingLine.data.size();i++)//initializing new array
        {
            Final_Array[i][3]=m.drawingLine.data.get(i).GateNo;
            for(int j=0;j<3;j++)
                Final_Array[i][j]=NOTHING;
        }

        for(int i=0;i<m.drawingLine.data.size();i++)
        {
            for(int j=0;j<6;j++)
            {
                if(A_Array[i][0]==In_Array[j])
                {
                    if(j==0)
                    {
                        Final_Array[i][0] = controller.c1 % 2;
                    }
                    else if(j==1)
                    {
                        Final_Array[i][0] = controller.c2 % 2;
                    }
                    else if(j==2)
                    {
                        Final_Array[i][0] = controller.c3 % 2;
                    }
                    else if(j==3)
                    {
                        Final_Array[i][0] = controller.c4 % 2;
                    }
                    else if(j==4)
                    {
                        Final_Array[i][0] = controller.c5 % 2;
                    }
                    else if(j==5)
                    {
                        Final_Array[i][0] = controller.c6 % 2;
                    }
                }
                if(A_Array[i][2]==In_Array[j] && In_Array[j]!=-9999999)
                {
                    if(j==0)
                    {
                        Final_Array[i][2] = controller.c1 % 2;
                    }
                    else if(j==1)
                    {
                        Final_Array[i][2] = controller.c2 % 2;
                    }
                    else if(j==2)
                    {
                        Final_Array[i][2] = controller.c3 % 2;
                    }
                    else if(j==3)
                    {
                        Final_Array[i][2] = controller.c4 % 2;
                    }
                    else if(j==4)
                    {
                        Final_Array[i][2] = controller.c5 % 2;
                    }
                    else if(j==5)
                    {
                        Final_Array[i][2] = controller.c6 % 2;
                    }
                }
            }
        }
        for(int i=0;i<m.drawingLine.data.size();i++)
        {
            for(int j=0;j<4;j++)
            {
                if(A_Array[i][1]==Out_Array[j] && Out_Array[j]!=-9999999)
                {
                    m.drawingLine.UpdateOutputIndex(i,j);
                }
            }
        }
       // Employee joe = new Employee(150, "Joe");
        try {
            CircuitLogicServer circuitLogic = new CircuitLogicServer();
            Socket socketConnection = new Socket("127.0.0.2", 11111);


            ObjectOutputStream clientOutputStream = new
                    ObjectOutputStream(socketConnection.getOutputStream());
            ObjectInputStream clientInputStream = new
                    ObjectInputStream(socketConnection.getInputStream());

            clientOutputStream.writeObject(circuitLogic);

            circuitLogic = (CircuitLogicServer) clientInputStream.readObject();

            //CircuitLogic circuitLogic=new CircuitLogic();
            FindSameIndexAndSet findSameIndexAndSet = new FindSameIndexAndSet();

            for (int k = 0; k < m.drawingLine.OutputData.size(); k++)//for the break after getting output
            {
                int countToStop = 0;
                while (Final_Array[m.drawingLine.OutputData.get(k).getOutput()][1] == NOTHING) {
                    countToStop++;
                    System.out.println("In while");
                    for (int i = 0; i < m.drawingLine.data.size(); i++) {

                        if (Final_Array[i][3] == 7408) {
                            if (Final_Array[i][0] != NOTHING && Final_Array[i][2] != NOTHING) {
                                int output;
                                output = circuitLogic.CircuitAnd(Final_Array[i][0], Final_Array[i][2]);
                                System.out.println("k    :  " + k + "  i  :  " + i + "  Output is: " + output);
                                Final_Array[i][1] = output;
                                findSameIndexAndSet.SetIndex(i, output, A_Array, m.drawingLine.data.size(), Final_Array);
                            }
                        } else if (Final_Array[i][3] == 7432) {
                            if (Final_Array[i][0] != NOTHING && Final_Array[i][2] != NOTHING) {
                                int output;
                                output = circuitLogic.CircuitOr(Final_Array[i][0], Final_Array[i][2]);
                                System.out.println("k    :  " + k + "  i  :  " + i + "  Output is: " + output);
                                Final_Array[i][1] = output;
                                findSameIndexAndSet.SetIndex(i, output, A_Array, m.drawingLine.data.size(), Final_Array);
                            }
                        } else if (Final_Array[i][3] == 7486) {
                            if (Final_Array[i][0] != NOTHING && Final_Array[i][2] != NOTHING) {
                                int output;
                                output = circuitLogic.CircuitXor(Final_Array[i][0], Final_Array[i][2]);
                                System.out.println("Output is: " + output);
                                Final_Array[i][1] = output;
                                findSameIndexAndSet.SetIndex(i, output, A_Array, m.drawingLine.data.size(), Final_Array);
                            }
                        } else if (Final_Array[i][3] == 7402) {
                            if (Final_Array[i][0] != NOTHING && Final_Array[i][2] != NOTHING) {
                                int output;
                                output = circuitLogic.CircuitNor(Final_Array[i][0], Final_Array[i][2]);
                                System.out.println("k    :  " + k + "  i  :  " + i + "  Output is: " + output);
                                Final_Array[i][1] = output;
                                findSameIndexAndSet.SetIndex(i, output, A_Array, m.drawingLine.data.size(), Final_Array);
                            }
                        } else if (Final_Array[i][3] == 7400) {
                            if (Final_Array[i][0] != NOTHING && Final_Array[i][2] != NOTHING) {
                                int output;
                                output = circuitLogic.CircuitNand(Final_Array[i][0], Final_Array[i][2]);
                                System.out.println("k    :  " + k + "  i  :  " + i + "  Output is: " + output);
                                Final_Array[i][1] = output;
                                findSameIndexAndSet.SetIndex(i, output, A_Array, m.drawingLine.data.size(), Final_Array);
                            }
                        } else if (Final_Array[i][3] == 7426) {
                            if (Final_Array[i][0] != NOTHING && Final_Array[i][2] != NOTHING) {
                                int output;
                                output = circuitLogic.CircuitXnor(Final_Array[i][0], Final_Array[i][2]);
                                System.out.println("k    :  " + k + "  i  :  " + i + "  Output is: " + output);
                                Final_Array[i][1] = output;
                                findSameIndexAndSet.SetIndex(i, output, A_Array, m.drawingLine.data.size(), Final_Array);
                            }
                        } else if (Final_Array[i][3] == 7404) {
                            if (Final_Array[i][0] != NOTHING) {
                                int output;
                                output = circuitLogic.CircuitNot(Final_Array[i][0]);
                                System.out.println("k    :  " + k + "  i  :  " + i + "  Output is: " + output);
                                Final_Array[i][1] = output;
                                findSameIndexAndSet.SetIndex(i, output, A_Array, m.drawingLine.data.size(), Final_Array);
                            }
                        }

                    }
                    if (countToStop == 8) {
                        System.out.println("to stop the While loop");
                        break;
                    }

                }
                //System.out.println("out of while");
            }

            clientOutputStream.close();
            clientInputStream.close();
        } catch (Exception e) {System.out.println("Client Exception is: "+e); }

    SetColorAndTextForOutput setColorAndTextForOutput=new SetColorAndTextForOutput();
        setColorAndTextForOutput.SetColor(controller,Final_Array,m);

    }
    public void SetMainInCheckingForOutput(Main m,SimulatorController controller)
    {
        this.m=m;
        this.controller=controller;
    }
}
