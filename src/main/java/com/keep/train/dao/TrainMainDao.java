package com.keep.train.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Timestamp;

import com.keep.train.model.TrainMain;



public class TrainMainDao {

	public int insert(TrainMain trainMain,Connection con) throws Exception{
		String sql="insert into tab_train_main values(?,?,?,?,?,?,?)";
		PreparedStatement pst = con.prepareStatement(sql);
		pst.setString(1, trainMain.getAutoId());
		pst.setString(2, trainMain.getProjcetNo());
		pst.setString(3, trainMain.getProjectName());
		pst.setString(4, trainMain.getDescription());
		pst.setString(5, trainMain.getRemark());
		pst.setTimestamp(6, new Timestamp(trainMain.getCreateTime().getTime()));
		pst.setTimestamp(7, new Timestamp(trainMain.getUpdateTime().getTime()));

		return pst.executeUpdate();
	}
	
	
}
