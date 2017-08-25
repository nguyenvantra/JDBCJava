# JDBCJava
## Database MySQL
```sql
--
-- Table structure for table `tbl_student`
--

CREATE TABLE `tbl_student` (
  `id` int(11) NOT NULL,
  `name` varchar(100) DEFAULT NULL,
  `address` varchar(255) DEFAULT NULL,
  `skill` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `tbl_student`
--

INSERT INTO `tbl_student` (`id`, `name`, `address`, `skill`) VALUES
(1, 'Darkness', 'HoChiMinh', 'Java');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `tbl_student`
--
ALTER TABLE `tbl_student`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `tbl_student`
--
ALTER TABLE `tbl_student`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
```
## Run application
- Change data file [Constant.java](https://github.com/nguyenvantra/JDBCJava/blob/master/src/team3/fsoft/constant/Constant.java).
- File [TestConnection.java](https://github.com/nguyenvantra/JDBCJava/blob/master/src/team3/fsoft/test/TestConnection.java) using test connect to database.
- File [App.java](https://github.com/nguyenvantra/JDBCJava/blob/master/src/team3/fsoft/test/App.java) using test bussiness login for application.
 