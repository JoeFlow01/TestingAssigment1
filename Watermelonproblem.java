public class Watermelonproblem {
                public String divisible(int w){
                    if(w%2==0)
                        return "Yes";
                    else
                        return "No";
                }
                public String equilibrium(int n,int xforces[],int yforces[],int zforces[]){
                    int sumx=0,sumy=0,sumz=0;
                    for(int i=0;i<n;i++){
                        sumx+=xforces[i];
                        sumy+=yforces[i];
                        sumz+=zforces[i];
                    }
                    if(sumx==0 && sumy==0 && sumz==0)
                        return "Equilibrium";
                    else
                        return "Not equilibrium";
                }
}
