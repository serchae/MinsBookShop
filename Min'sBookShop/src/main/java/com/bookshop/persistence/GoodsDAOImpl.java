package com.bookshop.persistence;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.bookshop.domain.GoodsVO;
import com.bookshop.domain.ImageFileVO;

public class GoodsDAOImpl implements GoodsDAO {

	@Override
	public List<GoodsVO> selectGoodsList(String goodsStatus) throws DataAccessException {
		// TODO Auto-generated method stub
		return null;
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
