package com.halfsummer.business.mapper;

import com.halfsummer.business.domain.Book;
import com.halfsummer.business.domain.BookExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BookMapper {
    int countByExample(BookExample example);

    int deleteByExample(BookExample example);

    int deleteByPrimaryKey(String bookId);

    int insert(Book record);

    int insertSelective(Book record);

    List<Book> selectByExample(BookExample example);

    Book selectByPrimaryKey(String bookId);

    int updateByExampleSelective(@Param("record") Book record, @Param("example") BookExample example);

    int updateByExample(@Param("record") Book record, @Param("example") BookExample example);

    int updateByPrimaryKeySelective(Book record);

    int updateByPrimaryKey(Book record);
}