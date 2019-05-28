package com.bookshop.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.bookshop.domain.GoodsVO;
import com.bookshop.persistence.GoodsDAO;

@Service("goodsService")
@Transactional(propagation=Propagation.REQUIRED)
public class GoodsServiceImpl implements GoodsService {
@Autowired
GoodsDAO goodsDAO;

public Map<String, List<GoodsVO>> listGoods() throws Exception{
	Map<String, List<GoodsVO>> goodsMap=new HashMap<String, List<GoodsVO>>();
	// new book, bestseller, steadyseller 조건으로 도서 정보를 조회
	// hashmap에 저장 후 반환
	List goodsList=goodsDAO.selectGoodsList("bestseller");
	goodsMap.put("bestseller",goodsList);
	
	goodsList=goodsDAO.selectGoodsList("newbook");
	goodsMap.put("newbook",goodsList);
	
	goodsList=goodsDAO.selectGoodsList("steadyseller");
	goodsMap.put("steadyseller",goodsList);
	return goodsMap;
	
}

@Override
public Map goodsDetail() {
	// TODO Auto-generated method stub
	return null;
}

@Override
public List<String> keywordSearch(String keyword) throws Exception {
	// TODO Auto-generated method stub
	return null;
}

@Override
public List<GoodsVO> searchGoods(String searchWord) throws Exception {
	// TODO Auto-generated method stub
	return null;
}
}
