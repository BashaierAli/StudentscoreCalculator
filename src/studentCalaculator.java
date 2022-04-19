public class studentCalaculator {
    private  int satScore;
    public void calcultoreSATScore(int nathsScore,int literacyScore){
        if (nathsScore<0 ||nathsScore>100||literacyScore<0||literacyScore>100){
            satScore=-1;
        }else {
            satScore=nathsScore * literacyScore;
        }
    }
    public int getSatScore(){
        return this.satScore;
    }
}
