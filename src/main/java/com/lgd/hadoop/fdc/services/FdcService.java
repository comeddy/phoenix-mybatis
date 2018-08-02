package com.lgd.hadoop.fdc.services;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.lgd.hadoop.fdc.domain.FdcTest;
import com.lgd.hadoop.fdc.mappers.FdcMapper;
import com.lgd.hadoop.fdc.util.MyBatisSqlSessionFactory;


public class FdcService 
{
	private Logger logger = LoggerFactory.getLogger(getClass());
	
	public List<FdcTest> findAllFdcTest()
	{
		SqlSession sqlSession = MyBatisSqlSessionFactory.getSqlSession();
		try {
			FdcMapper fdcMapper = sqlSession.getMapper(FdcMapper.class);
			return fdcMapper.findAllFdcTest();
		} finally {
			sqlSession.close();
		}
	}
	
	public FdcTest findFdcTestById(Integer fdc_id)
	{
		logger.debug("Select FdcTest By ID :{}", fdc_id);
		SqlSession sqlSession = MyBatisSqlSessionFactory.getSqlSession();
		try {
			FdcMapper fdcMapper = sqlSession.getMapper(FdcMapper.class);
			return fdcMapper.findFdcTestById(fdc_id);
			//return sqlSession.selectOne("com.mybatis3.FdcMapperMapper.findFdcMapperById", studId);
		} finally {
			sqlSession.close();
		}
	}
	
	public void createFdcMapper(FdcTest fdc)
	{
		SqlSession sqlSession = MyBatisSqlSessionFactory.getSqlSession();
		try {
			FdcMapper fdcMapper = sqlSession.getMapper(FdcMapper.class);
			fdcMapper.insertFdcTest(fdc);
			sqlSession.commit();
		} finally {
			sqlSession.close();
		}
	}
	
	public void updateFdcMapper(FdcTest fdc)
	{
		SqlSession sqlSession = MyBatisSqlSessionFactory.getSqlSession();
		try {
			FdcMapper fdcMapper = sqlSession.getMapper(FdcMapper.class);
			fdcMapper.updateFdcTest(fdc);
			sqlSession.commit();
		} finally {
			sqlSession.close();
		}
	}
}
