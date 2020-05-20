package com.example.test.service;

import com.example.test.dto.BoardDto;
import com.example.test.repository.BoardRepository;
import com.example.test.vo.BoardEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import lombok.AllArgsConstructor;
import javax.transaction.Transactional;

@AllArgsConstructor
@Service
public class BoardService {
    private BoardRepository boardRepository;

    @Transactional
    public Long savePost(BoardDto boardDto) {

        return boardRepository.save(boardDto.toEntity()).getId();
    }
}
