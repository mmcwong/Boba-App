//
//  BACurrentRunTableViewCell.h
//  BobaApp
//
//  Created by Brandon Tram on 10/5/14.
//  Copyright (c) 2014 coursera interns. All rights reserved.
//

#import <UIKit/UIKit.h>

@interface BACurrentRunTableViewCell : UITableViewCell

@property (weak, nonatomic) IBOutlet UIImageView *hostImageView;
@property (weak, nonatomic) IBOutlet UILabel *hostNameLabel;
@property (weak, nonatomic) IBOutlet UILabel *itemLabel;
@property (weak, nonatomic) IBOutlet UILabel *runDateLabel;

@end
