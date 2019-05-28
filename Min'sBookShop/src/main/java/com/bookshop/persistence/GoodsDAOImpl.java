package com.bookshop.persistence;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

import com.bookshop.domain.GoodsVO;
import com.bookshop.domain.ImageFileVO;
@Repository("goodsDAO")
public class GoodsDAOImpl implements GoodsDAO {
	@Autowired
	private SqlSession sqlsession;
	
	@Override
	public List<GoodsVO> selectGoodsList(String goodsStatus) throws DataAccessException {
		// 메소드 호출 시 전달된 조건으로 도서 검색
		List goodsList = (ArrayList)sqlsession.selectList("mapper.goods.selectGoodList",goodsStatus);
		return goodsList;
	}

	@Override
	public List<String> selectKeywordSearch(String keyword) throws DataAccessException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GoodsVO selectGoodsDatail(String goods_id) throws DataAccessException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ImageFileVO> selectGoodsDetailImage(String goods_id) throws DataAccessException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<GoodsVO> selectGoodsBySearchWord(String searchWord) throws DataAccessException {
		// TODO Auto-generated method stub
		return null;
	}

}
