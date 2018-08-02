package com.lgd.hadoop.fdc.mappers;

import java.util.List;

import com.lgd.hadoop.fdc.domain.FdcTest;


public interface FdcMapper
{

	List<FdcTest> findAllFdcTest();

	FdcTest findFdcTestById(Integer id);

	void insertFdcTest(FdcTest FdcTest);

	void updateFdcTest(FdcTest FdcTest);

}
