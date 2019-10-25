
package com.laptrinhjavaweb.responsitory.impl;

public class UserRepository {

	/*
	 * @Override public List<UserDTO> findAll(int status) {
	 * 
	 * String sql = "select * from user where status = ? and usernam = ?"; String
	 * userName = "gfg"; List<UserDTO> results = new ArrayList<UserDTO>();
	 * Connection connection = null; PreparedStatement statement = null; ResultSet
	 * resultSet = null;
	 * 
	 * try { connection = EntityManagerFactory.getConnection(); statement =
	 * connection.prepareStatement(sql); statement.setInt(1, status);
	 * statement.setString(2, userName); resultSet = statement.executeQuery(); while
	 * (resultSet.next()) { UserDTO userDTO = new UserDTO();
	 * userDTO.setUserName(resultSet.getString("username"));
	 * userDTO.setFullName(resultSet.getString("fullname")); results.add(userDTO); }
	 * return results;
	 * 
	 * } catch (Exception e) { return null; } finally { try { if (connection !=
	 * null) { connection.close(); } if (statement != null) { statement.close(); }
	 * if (resultSet != null) { resultSet.close(); } } catch (SQLException e) {
	 * return null; } }
	 * 
	 * }
	 */

}
