/**----------------------------------------------------------------------------------*
 *______________   _____   _   _  ______  ___   _____ _____ _____ _____ _____ _     
 *| ___ \ ___ \ \ / / _ \ | \ | | | ___ \/ _ \ /  ___/  ___|  ___|_   _|_   _( )    
 *| |_/ / |_/ /\ V / /_\ \|  \| | | |_/ / /_\ \\ `--.\ `--.| |__   | |   | | |/ ___ 
 *| ___ \    /  \ /|  _  || . ` | | ___ \  _  | `--. \`--. \  __|  | |   | |   / __|
 *| |_/ / |\ \  | || | | || |\  | | |_/ / | | |/\__/ /\__/ / |___  | |   | |   \__ \
 *\____/\_| \_| \_/\_| |_/\_| \_/ \____/\_| |_/\____/\____/\____/  \_/   \_/   |___/
 *.----.  .----. .-. . .-..-.   .-..-. .-. .---.    .-. .-.  .--.  .---.  .--.  
 *| {}  }/  {}  \| |/ \| || |   | ||  `| |/   __}   | |/ /  / {} \{_   _}/ {} \ 
 *| {}  }\      /|  .'.  || `--.| || |\  |\  {_ }   | |\ \ /  /\  \ | | /  /\  \
 *`----'  `----' `-'   `-'`----'`-'`-' `-' `---'    `-' `-'`-'  `-' `-' `-'  `-'
 *    _______ ___ ___ _______  
 *  / /_   _| __/ __|_   _\ \ 
 * | |  | | | _|\__ \ | |  | |
 * | |  |_| |___|___/ |_|  | |
 *  \_\                   /_/
 * @author Bryan James Bassett, Kent State University c/o 2016
 * -------------------"I've always dreamed of working at Kent"-----------------------*
 */
 
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
