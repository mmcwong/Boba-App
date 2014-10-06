//
//  BAMyRunsTableViewCell.h
//  BobaApp
//
//  Created by Brandon Tram on 10/5/14.
//  Copyright (c) 2014 coursera interns. All rights reserved.
//

#import <UIKit/UIKit.h>

@interface BAMyRunsTableViewCell : UITableViewCell

@property (weak, nonatomic) IBOutlet UILabel *itemLabel;
@property (weak, nonatomic) IBOutlet UILabel *dateLabel;
@property (weak, nonatomic) IBOutlet UILabel *restaurantLabel;
@property (weak, nonatomic) IBOutlet UILabel *timeRemainingLabel;

@end
