class Iso{
    static final int  CHAR=256;
    static boolean
    isoMoprhicdtrings(String str1,
                      String str2)
    {
        int n=str1.length();
        int m=str2.length();
        if (n!=m)
            return false;
        int[]countChars1=new int[CHAR];
        int[]countChars2=new int[CHAR];
        for(int i=0; i<n; i++)
        {
            countChars1[str1.charAt(i)]++;
            countChars2[str2.charAt(i)]++;

            if(countChars1[str1.charAt(i)] != countChars2[str2.charAt(i)])
            {return false;
            }
        }
        return true;
    }
    public static void main(String[] args)
    {
        System.out.println(isoMoprhicdtrings("s","t")?1:0);
    }
}

                   