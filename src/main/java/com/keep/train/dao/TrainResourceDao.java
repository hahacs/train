package com.keep.train.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.keep.train.model.TrainResource;

public class TrainResourceDao {

	public int insert(TrainResource trainResource,Connection con) throws Exception{
		String sql="insert into tab_train_resource values(?,?,?,?,?)";
		PreparedStatement pst = con.prepareStatement(sql);
		pst.setString(1, trainResource.getAutoId());
		pst.setString(2, trainResource.getProjcetNo());
		pst.setInt(3, trainResource.getType());
		pst.setString(4, trainResource.getPath());
		pst.setString(5, trainResource.getRemark());

		return pst.executeUpdate();
	}
}
