package com.devsuperior.dslist.service;

import com.devsuperior.dslist.dto.GameListDTO;
import com.devsuperior.dslist.dto.GameMinDTO;
import com.devsuperior.dslist.entity.Game;
import com.devsuperior.dslist.entity.GameList;
import com.devsuperior.dslist.repository.GameListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameListService
{
    @Autowired
    private GameListRepository gameListRepository;

    /*
     * Retorna uma lista de games
     */
    @Transactional
    public List<GameListDTO> findAll()
    {
        List<GameList> result = gameListRepository.findAll();

        //Transforma uma Lista de Games em um Objeto DTO
        List<GameListDTO> dto = result.stream().map(x -> new GameListDTO(x)).toList();

        return dto;
    }
}
