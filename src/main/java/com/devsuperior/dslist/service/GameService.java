package com.devsuperior.dslist.service;

import com.devsuperior.dslist.dto.GameDTO;
import com.devsuperior.dslist.dto.GameMinDTO;
import com.devsuperior.dslist.entity.Game;
import com.devsuperior.dslist.repository.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameService
{
    @Autowired
    private GameRepository gameRepository;

    /*
     * Retorna uma lista de games
     */
    @Transactional
    public List<GameMinDTO> findAll()
    {
        List<Game> result = gameRepository.findAll();

        //Transforma uma Lista de Games em um Objeto DTO
        List<GameMinDTO> dto = result.stream().map(x -> new GameMinDTO(x)).toList();

        return dto;
    }

    /*
     * Retorna uma
     */
    @Transactional(readOnly = true)
    public GameDTO findById(Long id)
    {
        Game result = gameRepository.findById(id).get();

        return new GameDTO(result);
    }
}
