package io.zipcoder;

public class Music {

    private String[] playList;

    public Music(String[] playList){
        this.playList = playList;
    }

    public Integer selection(Integer startIndex, String selection){
        Integer moveCount1 = 0;
        Integer moveCount2 = 0;
        Integer currentIndex = startIndex;

        while(true){
            currentIndex++;
            if(currentIndex == this.playList.length){
                currentIndex = 0;
            }
            moveCount1++;
            if(this.playList[currentIndex].equals(selection)){
                break;
            }
        }

        currentIndex = startIndex;
        while(true){
            currentIndex--;
            if(currentIndex == -1){
                currentIndex = this.playList.length - 1;
            }
            moveCount2++;
            if(this.playList[currentIndex].equals(selection)){
                break;
            }
        }

        if(moveCount1 < moveCount2){
            return moveCount1;
        }
        return moveCount2;
    }
}
