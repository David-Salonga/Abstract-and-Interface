package model;

public class Computation {

    public int chicken, hen, cock;

    public Computation() {
    }

    public Computation(int chicken, int hen, int cock) {
        this.chicken = chicken;
        this.hen = hen;
        this.cock = cock;
    }



    public void compute(){

        for(cock=0;cock<=20;cock++)
        {
            for(hen=0;hen<=33;hen++)
            {
                for(chicken=0;chicken<=100;chicken+=3)
                {
                    if((cock+hen+chicken)==100 && (5*cock+3*hen+chicken/3)==100)
                    {
                        System.out.println("cock: "+ cock + ", hen: "+ hen + ", chick: "+ chicken);
                    }
                }
            }
        }
    }
}
