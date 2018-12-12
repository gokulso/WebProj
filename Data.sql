CREATE TABLE Users(
UserId int IDENTITY(1,1) PRIMARY KEY,
Email varchar(50),
Password  varchar(50),
UserTypeId int,
IsOwner  BIT,
JoinDate  DATE,
InterCom  int,
IsStayingHere BIT,
IsActive  BIT,
);

 

SELECT * FROM Users

 

Insert into users (Email,Password) values('g@gmail.com','password')

 

CREATE TABLE MemberInformation(
MemberId int IDENTITY(1,1) PRIMARY KEY,
SocietyId int,
Name  varchar(50),
Email varchar(50),
GenderId int,
DOB    DATE,
BadgeNumber int,
Wing   varchar(50),
FlatNumber int,
Mobile   varchar(50),
Phone varchar(50),
RoleId varchar(50),
IsActive BIT,
)

 

 SELECT * FROM Vender


CREATE TABLE SOCIETY(
Name varchar(50),
Address1 varchar(50),
Address2 varchar(50),
CityId  int,
Mobile varchar(50),
Phone  varchar(50),
SocietyEmail  varchar(50),
Website  varchar(50),
UserEmail  varchar(50),
Password  varchar(50),
UserTypeId  int,
IsOwner   BIT,
JoinDate   date,
InterCom int,
IsStayingHere BIT,
MemberName  varchar(50),
DOB  date,
)

SELECT * FROM SOCIETY



----------------------------------------------
CREATE TABLE CITY(
id int identity primary key,
name VARCHAR(50)

)
    -----------------------
CREATE PROC uspGetCity
AS
SELECT * FROM CITY
GO;

-------------------------------


CREATE TABLE SocietyList(
id int identity primary key,
name VARCHAR(50),
citiId int FOREIGN KEY REFERENCES CITY(id)
)

INSERT INTO SocietyList VALUES ('TushiViahr',1);
INSERT INTO SocietyList VALUES ('GokulNagari',1);
INSERT INTO SocietyList VALUES ('Ashirwad Appt',2);
INSERT INTO SocietyList VALUES ('Royel Residency',2);
 ---------------------------
CREATE PROC uspGetSocietyList @citiID  int
AS
SELECT id,Name from SocietyList where citiId = @citiID


EXEC uspGetCity;
EXEC uspGetSocietyList 1 

D:\WebProj\Apartment

---------------------------------





alter table CITY drop column CityID

INSERT INTO SocietyList VALUES ('TushiViahr',1);
INSERT INTO SocietyList VALUES ('GokulNagari',1);
INSERT INTO SocietyList VALUES ('Ashirwad Appt',2);
INSERT INTO SocietyList VALUES ('Royel Residency',2);

--drop table SocietyList


SELECT * FROM CITY
SELECT * FROM  SocietyList ;



Select * From Users
update Users set IsActive = 1 where UserId = 1

g@gmail.com

password

ALTER TABLE Users RENAME COLUMN

EXEC sp_RENAME 'MemberInformation.MemberId' , 'UserId', 'COLUMN'


SELECT * FROM MemberInformation
INSERT INTO MemberInformation VALUES ('Tulshiram','t@t.com',1,GETDATE(),1,'A',1,'0000011111','999999999','007',1);


SELECT * FROM MemberInformation
SELECT * FROM Users



CREATE PROC uspAddUser @Email varchar(50),@Password  varchar(50),@UserTypeId int,@IsOwner  BIT,@JoinDate DATE,@InterCom  int,@IsStayingHere BIT,
@SocietyId int,@Name  varchar(50),@DOB DATE,@BadgeNumber int,@Wing  varchar(50),@FlatNumber int,@Mobile varchar(50),@Phone varchar(50),@GenderId int,@RoleId varchar(50)
AS
BEGIN
DECLARE @Status int
  BEGIN TRY
    BEGIN TRANSACTION
	SET @Status = 0
      INSERT INTO Users VALUES(@Email,@Password,@UserTypeId,@IsOwner,@JoinDate,@InterCom,@IsStayingHere,1)
      INSERT INTO MemberInformation VALUES(@SocietyId,@Name,@Email,@GenderId,@DOB,@BadgeNumber,@Wing,@FlatNumber,@Mobile,@Phone,@RoleId,1)
    COMMIT TRANSACTION;
  END TRY
  BEGIN CATCH
   IF @@TRANCOUNT > 0
   SET @Status = 1
     ROLLBACK TRANSACTION;
  END CATCH
  SELECT @Status AS Status
RETURN 
END
GO

