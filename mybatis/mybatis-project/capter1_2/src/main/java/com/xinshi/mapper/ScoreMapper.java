package com.xinshi.mapper;

import com.xinshi.pojo.Score;

import java.util.List;

public interface ScoreMapper {
    List<Score> findScoreByStudent1Id(Integer id);
}
