import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import org.junit.Before;
import org.junit.Test;
    /**
     * TEST CODE IS BELOW
     */
public class BowlingGameTest{
    private BowlingGame game;
    
    @Before
    public void SetUp() {
        game = new BowlingGame();
    }


    @Test
    public void canScoreGutterGame(){
        game.roll (0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0);
        assertThat(game.score(), is(0));
    }
    @Test
    public void canScoreAGameOfOnes(){    
        game.roll (1,1, 1,1, 1,1, 1,1, 1,1, 1,1, 1,1, 1,1, 1,1, 1,1);
        assertThat(game.score(), is(20));
    }
    @Test
    public void canScoreSpareFollowedByThree(){
        game.roll(5,5, 3,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0);
        assertThat(game.score(), is(16));
    }
    @Test
    public void canScoreStrikeFollowedByThreeThenThree(){
        game.roll(10, 3,3, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0);
        assertThat(game.score(), is(22));
    }
    
    @Test
    public void canScorePerfectGame() {
        game.roll(10,10,10,10,10,10,10,10,10,10,10,10);
        assertThat(game.score(), is(300));
    }
}