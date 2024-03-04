//imports data from database

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DecimalFormat;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DataImport {

	public static void main(String[] args) {

		try {

			// Setting up database connection
			String dbName = "healthy_aging.db";
			String url = "jdbc:sqlite:" + dbName;
			Connection connection = DriverManager.getConnection(url);
			connection.setAutoCommit(false);

			// Removing the old table
			Statement dropStatement = connection.createStatement();
			dropStatement.executeUpdate("DROP TABLE IF EXISTS healthy_aging");

			// Creating the new table with updated values in the database
			Statement createStatement = connection.createStatement();
			String newTable = "CREATE TABLE IF NOT EXISTS healthy_aging (" + "Lifelong_Learning_Activities TEXT, "
					+ "Practitioner_Based_Integrative_Medicine TEXT, " + "Body_Therapy TEXT, " 
					+ "Meditation TEXT, "  + "Physically_Active TEXT, " + "Physical_Activity TEXT, " 
					+ "Do_You_Eat_A_Healthy_Diet TEXT, " + "Diet TEXT, " + "Average TEXT" + ")";
			createStatement.executeUpdate(newTable);

			// Data to be inserted
			PreparedStatement insertStatement = connection.prepareStatement(
					"INSERT INTO healthy_aging (Lifelong_Learning_Activities, Practitioner_Based_Integrative_Medicine, "
							+ "Body_Therapy, Meditation, Physically_Active, Physical_Activity, Do_You_Eat_A_Healthy_Diet, "
							+ "Diet, Average) "
							+ "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)");

			// Reading from the final data file
			FileInputStream fis = new FileInputStream(new File(args[0]));
			Workbook workbook = WorkbookFactory.create(fis);
			Sheet sheet = workbook.getSheetAt(0);

			// Inserting data from the file into the table
			for (Row row : sheet) {
				if (row.getRowNum() < 2) { // skipping the header row
					continue;
				}
				Cell lifelongLearningCell = row.getCell(1);
				Cell practitionerMedicineCell = row.getCell(2);
				Cell bodyTherapyCell = row.getCell(3);
				Cell meditationCell = row.getCell(4);
				Cell physicallyActiveCell = row.getCell(5);
				Cell physicalActivityCell = row.getCell(6);
				Cell healthyDietCell = row.getCell(7);
				Cell dietCell = row.getCell(8);
				Cell averageCell = row.getCell(9);

				String lifelongLearning = lifelongLearningCell.getStringCellValue();
				String practitionerMedicine = practitionerMedicineCell.getStringCellValue();
				String bodyTherapy = bodyTherapyCell.getStringCellValue();
				String meditation = meditationCell.getStringCellValue();
				String physicallyActive = physicallyActiveCell.getStringCellValue();
				String physicalActivity = physicalActivityCell.getStringCellValue();
				String healthyDiet = healthyDietCell.getStringCellValue();
				String diet = dietCell.getStringCellValue();
				double average = averageCell.getNumericCellValue();
				
	            DecimalFormat df = new DecimalFormat("#.#");
				average = Double.parseDouble(df.format(average));

				insertStatement.setString(1, lifelongLearning);
				insertStatement.setString(2, practitionerMedicine);
				insertStatement.setString(3, bodyTherapy);
				insertStatement.setString(4, meditation);
				insertStatement.setString(5, physicallyActive);
				insertStatement.setString(6, physicalActivity);
				insertStatement.setString(7, healthyDiet);
				insertStatement.setString(8, diet);
				insertStatement.setDouble(9, average);
				insertStatement.addBatch();
			}

			insertStatement.executeBatch();

			connection.commit();

			connection.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (EncryptedDocumentException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
