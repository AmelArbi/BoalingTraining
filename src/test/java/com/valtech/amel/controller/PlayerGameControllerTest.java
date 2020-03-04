//package com.valtech.amel.controller;
//
//import com.valtech.amel.dto.PlayerNameDto;
//import com.valtech.amel.dto.WurfDto;
//import com.valtech.amel.service.GameRepository;
//import com.valtech.amel.service.GameRepositoryClass;
//import com.valtech.amel.service.GameService;
//import com.valtech.amel.service.PlayerGameRepository;
//import org.junit.Before;
//import org.junit.Test;
//import static org.hamcrest.CoreMatchers.is;
//import static org.hamcrest.CoreMatchers.nullValue;
//import static org.junit.Assert.assertThat;
//
//public class PlayerGameControllerTest {
//
//    private GameRepositoryClass gameRepositoryClass;
//    private GameController gameController;
//
//    private GameRepository gameRepository;
//    private PlayerGameRepository playerGameRepository;
//
//    @Before
//    public void init(){
//        gameRepositoryClass = new GameRepositoryClass(gameRepository, playerGameRepository);
//        gameController = new GameController(new GameService(), gameRepositoryClass);
//
//    }
//
//    @Test (expected= GameNotInitialized.class)
//    public void willReturnExceptionIfGameNotInitialzed() {
//        gameController.spielStand(123,1234);
//    }
//
//    @Test (expected= PlayerNotFound.class)
//    public void willReturnExceptionIfPlayerNotFound() {
//        long gameId = gameRepositoryClass.createGame();
//        gameController.spielStand(gameId,123);
//    }
//
//
//    @Test ()
//    public void GameInitialized() {
//        long gameId = gameRepositoryClass.createGame();
//        long playerId = gameRepositoryClass.createPlayerGame(gameId);
//        assertThat(gameController.spielStand(gameId,playerId).getFrames().isEmpty(), is(true));
//        assertThat(gameController.spielStand(gameId,playerId).getPlayerName(), nullValue());
//        assertThat(gameController.spielStand(gameId,playerId).getTurn(), is(0));
//    }
//
//
//    @Test ()
//    public void GameInitialized4Turn() {
//        long gameId = gameRepositoryClass.createGame();
//        long playerId = gameRepositoryClass.createPlayerGame(gameId);
//        PlayerNameDto playerNameDto = new PlayerNameDto("Alex");
//        gameController.spielerName(gameId,playerId,playerNameDto);
//        gameController.wurf(gameId,playerId,new WurfDto(10));
//        gameController.wurf(gameId,playerId,new WurfDto(10));
//        gameController.wurf(gameId,playerId,new WurfDto(10));
//        gameController.wurf(gameId,playerId,new WurfDto(10));
//        assertThat(gameController.spielStand(gameId,playerId).getFrames().get(0).getScore(), is(30));
//        assertThat(gameController.spielStand(gameId,playerId).getFrames().get(1).getScore(), is(60));
//        assertThat(gameController.spielStand(gameId,playerId).getFrames().get(2).getScore(), is(80));
//        assertThat(gameController.spielStand(gameId,playerId).getFrames().get(3).getScore(), is(90));
//    }
//
//
//}
