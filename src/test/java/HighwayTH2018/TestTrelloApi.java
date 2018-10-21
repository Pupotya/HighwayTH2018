package HighwayTH2018;

import Lesson16.TrelloApi;
import org.testng.annotations.Test;

public class TestTrelloApi {

    @Test
    public void testGetBoardLists() throws Exception {
        TrelloApi trelloApi = new TrelloApi();
        String boardList = trelloApi.getBoardList("Lw47PMFp");
        System.out.println(boardList);
    }
    
    @Test
    public void testGetBoardLabels() throws Exception {
        TrelloApi trelloApi = new TrelloApi();
        String boardList = trelloApi.getBoardLabels("Lw47PMFp");
        System.out.println(boardList);
    }

}
